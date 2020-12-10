package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.recurly.v3.fixtures.DateTimeTestClass;
import com.recurly.v3.fixtures.FixtureConstants;
import com.recurly.v3.fixtures.MyRequest;
import com.recurly.v3.fixtures.MyResource;
import com.recurly.v3.Constants;
import org.joda.time.DateTime;
import org.junit.jupiter.api.Test;

public class JsonSerializerTest {

  @Test
  public void testDeserialize() {
    final JsonSerializer jsonSerializer = new JsonSerializer();
    final MyResource mockResource =
        jsonSerializer.deserialize(getMockResourceJson(), MyResource.class);
    assertEquals("My String", mockResource.getMyString());
    assertEquals(FixtureConstants.ConstantType.TWENTY_THREE, mockResource.getMyConstant());
  }

  @Test
  public void testDeserializeError() {
    final JsonSerializer jsonSerializer = new JsonSerializer();
    final ApiException error = jsonSerializer.deserialize(getMockErrorJson(), ApiException.class);
    assertEquals(Constants.ErrorType.NOT_FOUND, error.getError().getType());
    assertEquals("Couldn't find resource", error.getError().getMessage());
    assertEquals("some_param", error.getError().getParams().get(0).get("param"));
  }

  @Test
  public void testSerialize() {
    final JsonSerializer jsonSerializer = new JsonSerializer();
    final MyRequest mockRequest = new MyRequest();
    mockRequest.setMyString("aaron");
    mockRequest.setMyConstant(FixtureConstants.ConstantType.TWENTY_THREE);
    final String serialized = jsonSerializer.serialize(mockRequest);
    assertEquals("{\"my_string\":\"aaron\",\"my_constant\":\"twenty-three\"}", serialized);
  }

  @Test
  public void testDateDeserialization() {
    final JsonSerializer jsonSerializer = new JsonSerializer();
    final DateTimeTestClass dttc =
        jsonSerializer.deserialize(getDateTimesJson(), DateTimeTestClass.class);
    checkDateTime(dttc.getDate1());
    checkDateTime(dttc.getDate2());
    checkDateTime(dttc.getDate3());
    checkDateTime(dttc.getDate4());
    checkDateTime(dttc.getDate5());
    checkDateTime(dttc.getDate6());
  }

  private static String getMockResourceJson() {
    return ""
        + "{\n"
        + "    \"object\": \"mock_resource\",\n"
        + "    \"my_string\": \"My String\",\n"
        + "    \"my_float\": 3.14,\n"
        + "    \"my_int\": 7,\n"
        + "    \"my_boolean\": true,\n"
        + "    \"my_datetime\": \"2019-04-23T16:48:55Z\",\n"
        + "    \"my_nested_resource\": {\n"
        + "       \"object\": \"nested_resource\",\n"
        + "       \"my_string\": \"Nested String\"\n"
        + "    },\n"
        + "    \"my_string_list\": [\n"
        + "        \"String 1\",\n"
        + "        \"String 2\"\n"
        + "    ],\n"
        + "    \"my_nested_resource_list\": [\n"
        + "       {\n"
        + "          \"object\": \"nested_resource\",\n"
        + "          \"my_string\": \"Nested String\"\n"
        + "       },\n"
        + "       {\n"
        + "          \"object\": \"nested_resource\",\n"
        + "          \"my_string\": \"Nested String\"\n"
        + "       }\n"
        + "    ],\n"
        + "    \"my_constant\": \"twenty-three\"\n"
        + "}";
  }

  private static String getMockErrorJson() {
    return ""
        + "{\n"
        + "    \"error\": {\n"
        + "       \"type\": \"not_found\",\n"
        + "       \"message\": \"Couldn't find resource\",\n"
        + "       \"params\": [\n"
        + "           {\"param\":\"some_param\"}\n"
        + "        ]\n"
        + "    }\n"
        + "}";
  }

  private static String getDateTimesJson() {
    return ""
        + "{\n"
        + "    \"date1\": \"2019-05-31T15:31:24\",\n"
        + "    \"date2\": \"2019-05-31T15:31:24.0000000\",\n"
        + "    \"date3\": \"2019-05-31T15:31:24.0000000Z\",\n"
        + "    \"date4\": \"2019-05-31T15:31:24.0000000-07:00\",\n"
        + "    \"date5\": \"2019-05-31T15:31:24.099Z\",\n"
        + "    \"date6\": \"2019-05-31T15:31:24Z\"\n"
        + "}";
  }

  private static void checkDateTime(DateTime date) {
    assertEquals(DateTime.class, date.getClass());
    assertEquals(2019, date.getYear());
    assertEquals(5, date.getMonthOfYear());
    assertEquals(31, date.getDayOfMonth());
    assertEquals(15, date.getHourOfDay());
    assertEquals(31, date.getMinuteOfHour());
    assertEquals(24, date.getSecondOfMinute());
  }
}
