package com.recurly.v3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import com.recurly.v3.ApiException;
import org.joda.time.DateTime;
import java.util.List;
import java.util.Map;

public class JsonSerializerTest {

    @Test
    public void testDeserialize() {
        final JsonSerializer jsonSerializer = new JsonSerializer();
        final MockResource mockResource = jsonSerializer.deserialize(getMockResourceJson(), MockResource.class);
        assertEquals("My String", mockResource.getMyString());
    }

    @Test
    public void testDeserializeError() {
        final JsonSerializer jsonSerializer = new JsonSerializer();
        final ApiException error = jsonSerializer.deserialize(getMockErrorJson(), ApiException.class);
        assertEquals("not_found", error.getError().getType());
        assertEquals("Couldn't find resource", error.getError().getMessage());
        assertEquals("some_param", error.getError().getParams().get(0).get("param"));
    }

    @Test
    public void testSerialize() {
        final JsonSerializer jsonSerializer = new JsonSerializer();
        final MockRequest mockRequest = new MockRequest();
        mockRequest.setMyString("aaron");
        final String serialized = jsonSerializer.serialize(mockRequest);
        assertEquals("{\"my_string\":\"aaron\"}", serialized);
    }

    private static String getMockResourceJson() {
        return "" +
        "{\n" +
        "    \"object\": \"mock_resource\",\n" +
        "    \"my_string\": \"My String\",\n" +
        "    \"my_float\": 3.14,\n" +
        "    \"my_int\": 7,\n" +
        "    \"my_boolean\": true,\n" +
        "    \"my_datetime\": \"2019-04-23T16:48:55Z\",\n" +
        "    \"my_nested_resource\": {\n" +
        "       \"object\": \"nested_resource\",\n" +
        "       \"my_string\": \"Nested String\"\n" +
        "    },\n" +
        "    \"my_string_list\": [\n" +
        "        \"String 1\",\n" +
        "        \"String 2\"\n" +
        "    ],\n" +
        "    \"my_nested_resource_list\": [\n" +
        "       {\n" +
        "          \"object\": \"nested_resource\",\n" +
        "          \"my_string\": \"Nested String\"\n" +
        "       },\n" +
        "       {\n" +
        "          \"object\": \"nested_resource\",\n" +
        "          \"my_string\": \"Nested String\"\n" +
        "       }\n" +
        "    ]\n" +
        "}";
    }

    private static String getMockErrorJson() {
        return "" +
        "{\n" +
        "    \"error\": {\n" +
        "       \"type\": \"not_found\",\n" +
        "       \"message\": \"Couldn't find resource\",\n" +
        "       \"params\": [\n" +
        "           {\"param\":\"some_param\"}\n" +
        "        ]\n" +
        "    }\n" +
        "}";
    }

    private class MockResource extends Resource {
        @SerializedName("my_string")
        private String myString;

        @SerializedName("my_float")
        private Float myFloat;

        @SerializedName("my_int")
        private Integer myInt;

        @SerializedName("my_boolean")
        private Boolean myBoolean;

        @SerializedName("my_datetime")
        private DateTime myDateTime;

        @SerializedName("my_nested_resource")
        private NestedResource myNestedResource;

        @SerializedName("my_string_list")
        private List<String> myStringList;

        @SerializedName("my_nested_resource_list")
        private List<NestedResource> myNestedResourceList;

        public String getMyString() { return this.myString; }
        public void setMyString(final String myString) { this.myString = myString; }

        public Float getMyFloat() { return this.myFloat; }
        public void setMyFloat(final Float myFloat) { this.myFloat = myFloat; }

        public Integer getMyInt() { return this.myInt; }
        public void setMyInt(final Integer myInt) { this.myInt = myInt; }

        public Boolean getMyBoolean() { return this.myBoolean; }
        public void setMyBoolean(final Boolean myBoolean) { this.myBoolean = myBoolean; }

        public DateTime getMyDateTime() { return this.myDateTime; }
        public void setMyDateTime(final DateTime myDateTime) { this.myDateTime = myDateTime; }

        public NestedResource getMyNestedResource() { return this.myNestedResource; }
        public void setMyNestedResource(final NestedResource myNestedResource) { this.myNestedResource = myNestedResource; }

        public List<String> getMyStringList() { return this.myStringList; }
        public void setMyStringList(final List<String> myStringList) { this.myStringList = myStringList; }

        public List<NestedResource> getMyNestedResourceList() { return this.myNestedResourceList; }
        public void setMyNestedResourceList(final List<NestedResource> myNestedResourceList) { this.myNestedResourceList = myNestedResourceList; }
    }

    private class NestedResource extends Resource {
        @SerializedName("my_nested_string")
        private String myNestedString;
    }

    private class MockRequest extends Request {
        @SerializedName("my_string")
        private String myString;

        @SerializedName("my_float")
        private Float myFloat;

        @SerializedName("my_int")
        private Integer myInt;

        @SerializedName("my_boolean")
        private Boolean myBoolean;

        @SerializedName("my_datetime")
        private DateTime myDateTime;

        @SerializedName("my_nested_request")
        private NestedRequest myNestedRequest;

        @SerializedName("my_string_list")
        private List<String> myStringList;

        @SerializedName("my_nested_request_list")
        private List<NestedRequest> myNestedRequestList;

        public String getMyString() { return this.myString; }
        public void setMyString(final String myString) { this.myString = myString; }

        public Float getMyFloat() { return this.myFloat; }
        public void setMyFloat(final Float myFloat) { this.myFloat = myFloat; }

        public Integer getMyInt() { return this.myInt; }
        public void setMyInt(final Integer myInt) { this.myInt = myInt; }

        public Boolean getMyBoolean() { return this.myBoolean; }
        public void setMyBoolean(final Boolean myBoolean) { this.myBoolean = myBoolean; }

        public DateTime getMyDateTime() { return this.myDateTime; }
        public void setMyDateTime(final DateTime myDateTime) { this.myDateTime = myDateTime; }

        public NestedRequest getMyNestedRequest() { return this.myNestedRequest; }
        public void setMyNestedResource(final NestedRequest myNestedRequest) { this.myNestedRequest = myNestedRequest; }

        public List<String> getMyStringList() { return this.myStringList; }
        public void setMyStringList(final List<String> myStringList) { this.myStringList = myStringList; }

        public List<NestedRequest> getMyNestedRequestList() { return this.myNestedRequestList; }
        public void setMyNestedRequestList(final List<NestedRequest> myNestedRequestList) { this.myNestedRequestList = myNestedRequestList; }
    }

    private class NestedRequest extends Request {
        @SerializedName("my_nested_string")
        private String myNestedString;
    }
}
