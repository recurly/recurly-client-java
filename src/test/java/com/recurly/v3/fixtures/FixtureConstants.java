package com.recurly.v3.fixtures;

import com.google.gson.annotations.SerializedName;

public class FixtureConstants {
  
    public enum ConstantType {
      UNDEFINED,
    
      @SerializedName("one")
      ONE,
    
      @SerializedName("two")
      TWO,
    
      @SerializedName("twenty-three")
      TWENTY_THREE,
    
    };
    
}
