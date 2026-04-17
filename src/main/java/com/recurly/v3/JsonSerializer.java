package com.recurly.v3;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import com.google.gson.*;
import com.recurly.v3.exception.ExceptionFactory;

import java.lang.reflect.Type;

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
}
