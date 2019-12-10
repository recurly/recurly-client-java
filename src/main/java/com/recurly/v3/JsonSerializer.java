package com.recurly.v3;

import com.fatboyindustrial.gsonjodatime.Converters;
import com.google.gson.*;
import com.recurly.v3.exception.ExceptionFactory;
import java.lang.reflect.Type;
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
