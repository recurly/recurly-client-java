package com.recurly.v3;

import com.fatboyindustrial.gsonjodatime.Converters;
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

import org.joda.time.DateTime;

public class JsonSerializer {
  private class DateDeserializer implements JsonDeserializer<DateTime> {
    @Override
    public DateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2)
        throws JsonParseException {
      return DateTime.parse(element.getAsString());
    }
  }

  private final Gson gsonSerializer = Converters.registerDateTime(new GsonBuilder()).create();
  private final Gson gsonDeserializer =
      new GsonBuilder()
          .excludeFieldsWithoutExposeAnnotation()
          .registerTypeAdapter(DateTime.class, new DateDeserializer())
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
      T constant = nameToConstant.get(in.nextString());
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
