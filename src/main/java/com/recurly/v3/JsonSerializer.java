package com.recurly.v3;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import com.google.gson.*;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import com.recurly.v3.exception.ExceptionFactory;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

import java.time.ZonedDateTime;

public class JsonSerializer {
  private class DateDeserializer implements JsonDeserializer<ZonedDateTime> {
    @Override
    public ZonedDateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2)
        throws JsonParseException {
      String s = element.getAsString();
      try {
        return ZonedDateTime.parse(s);
      } catch (DateTimeParseException e) {
        return LocalDateTime.parse(s).atZone(ZoneOffset.UTC);
      }
    }
  }

  private class DateSerializer implements com.google.gson.JsonSerializer<ZonedDateTime> {
    @Override
    public JsonElement serialize(ZonedDateTime src, Type typeOfSrc, JsonSerializationContext context) {
      return new JsonPrimitive(DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(src));
    }
  }

  private final Gson gsonSerializer =
      new GsonBuilder()
          .registerTypeAdapter(ZonedDateTime.class, new DateSerializer())
          .create();
  private final Gson gsonDeserializer =
      new GsonBuilder()
          .excludeFieldsWithoutExposeAnnotation()
          .registerTypeAdapter(ZonedDateTime.class, new DateDeserializer())
          .registerTypeAdapterFactory(new RecurlyEnumTypeAdapterFactory())
          .create();

  public <T> T deserialize(String responseBody, final Type resourceClass) {
    return gsonDeserializer.fromJson(responseBody, resourceClass);
  }

  @SuppressWarnings("unchecked")
  public <T extends RecurlyException> T deserializeError(String responseBody) {
    ApiException apiException = gsonDeserializer.fromJson(responseBody, ApiException.class);
    return (T) ExceptionFactory.getExceptionClass(apiException);
  }

  public String serialize(Request body) {
    if (body == null) {
      return "";
    } else {
      return gsonSerializer.toJson(body);
    }
  }

  // Based on the EnumTypeAdapter from gson:
  // https://github.com/google/gson/blob/gson-parent-2.8.6/gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java#L773
  private static final class RecurlyEnumTypeAdapter<T extends Enum<T>> extends TypeAdapter<T> {
    private final Map<String, T> nameToConstant = new HashMap<String, T>();
    private final Map<T, String> constantToName = new HashMap<T, String>();

    public RecurlyEnumTypeAdapter(Class<T> classOfT) {
      try {
        for (T constant : classOfT.getEnumConstants()) {
          String name = constant.name();
          SerializedName annotation = classOfT.getField(name).getAnnotation(SerializedName.class);
          if (annotation != null) {
            name = annotation.value();
            for (String alternate : annotation.alternate()) {
              nameToConstant.put(alternate, constant);
            }
          }
          nameToConstant.put(name, constant);
          constantToName.put(constant, name);
        }
      } catch (NoSuchFieldException e) {
        throw new AssertionError(e);
      }
    }

    public T read(JsonReader in) throws IOException {
      if (in.peek() == JsonToken.NULL) {
        in.nextNull();
        return null;
      }
      String constantString = in.nextString();
      T constant = nameToConstant.get(constantString);
      // TODO: Remove this once the API stops Capitalizing the Coupon's redemption_resource
      if (constant == null) {
        constant = nameToConstant.get(constantString.toLowerCase());
      }
      if (constant == null) {
        return nameToConstant.get("UNDEFINED");
      }
      return constant;
    }

    public void write(JsonWriter out, T value) throws IOException {
      out.value(value == null ? null : constantToName.get(value));
    }
  }

  // Based on the TypeAdapterFactory in gson:
  // https://github.com/google/gson/blob/gson-parent-2.8.6/gson/src/main/java/com/google/gson/internal/bind/TypeAdapters.java#L808
  private class RecurlyEnumTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> typeToken) {
      Class<? super T> rawType = typeToken.getRawType();
      if (!Enum.class.isAssignableFrom(rawType) || rawType == Enum.class) {
        return null;
      }
      if (!rawType.isEnum()) {
        rawType = rawType.getSuperclass(); // handle anonymous subclasses
      }
      return (TypeAdapter<T>) new RecurlyEnumTypeAdapter(rawType);
    }
  }
}
