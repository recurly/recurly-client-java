package com.recurly.v3;

import com.recurly.v3.Request;
import com.recurly.v3.ApiException;
import com.recurly.v3.exception.ExceptionFactory;
import com.recurly.v3.RecurlyException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.fatboyindustrial.gsonjodatime.Converters;
import java.lang.reflect.Type;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormatter;
import org.joda.time.format.ISODateTimeFormat;

public class JsonSerializer {
    private class DateDeserializer implements JsonDeserializer<DateTime> {
        @Override
        public DateTime deserialize(JsonElement element, Type arg1, JsonDeserializationContext arg2) throws JsonParseException {
            final String string = element.getAsString();
            final DateTimeFormatter formatter = ISODateTimeFormat.dateTimeParser();

            return formatter.parseDateTime(string);
        }
    }

    private final Gson gsonSerializer = Converters.registerDateTime(new GsonBuilder()).create();
    private final Gson gsonDeserializer = new GsonBuilder().registerTypeAdapter(DateTime.class, new DateDeserializer()).create();

    public <T> T deserialize(String responseBody, final Type resourceClass) {
        return gsonDeserializer.fromJson(responseBody, resourceClass);
    }

    public <T extends RecurlyException> T deserializeError(String responseBody) {
        ApiException apiException = gsonDeserializer.fromJson(responseBody, ApiException.class);
        return (T) ExceptionFactory.getExceptionClass(apiException);
    }

    public String serialize(Request body) {
        return gsonSerializer.toJson(body);
    }

}
