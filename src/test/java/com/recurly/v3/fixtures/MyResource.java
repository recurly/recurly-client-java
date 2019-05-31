package com.recurly.v3.fixtures;

import com.google.gson.annotations.SerializedName;
import com.recurly.v3.Resource;
import org.joda.time.DateTime;

import java.util.List;

public class MyResource extends Resource {
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
