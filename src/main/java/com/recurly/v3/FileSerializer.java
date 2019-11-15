package com.recurly.v3;

import com.recurly.v3.resources.BinaryFile;
import java.lang.reflect.Type;

public class FileSerializer {
  public <T> T deserialize(byte[] responseBody, final Type resourceClass) {
    BinaryFile file = new BinaryFile();
    file.setData(responseBody);
    return (T) file;
  }
}
