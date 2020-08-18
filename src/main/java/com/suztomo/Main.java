package com.suztomo;

import com.google.protobuf.TextFormat;
import java.io.IOException;
import java.nio.CharBuffer;

public class Main {
  public static void main(String[] arguments) throws IOException {
    CharBuffer readable = CharBuffer.allocate(100);
    readable.put("Hello Java 8");
    TextFormat.merge((Readable) readable, null, null);
  }
}
