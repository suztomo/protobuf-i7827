https://github.com/protocolbuffers/protobuf/issues/7827

```
Exception in thread "main" java.lang.NoSuchMethodError: java.nio.CharBuffer.flip()Ljava/nio/CharBuffer;
	at com.google.protobuf.TextFormat$Parser.toStringBuilder(TextFormat.java:1686)
	at com.google.protobuf.TextFormat$Parser.merge(TextFormat.java:1670)
	at com.google.protobuf.TextFormat.merge(TextFormat.java:1480)
	at com.suztomo.Main.main(Main.java:30)
```
