/*
 *
 *  * Copyright 2020 Google LLC.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *     http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 *
 */

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
