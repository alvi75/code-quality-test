import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
      final char[] charBuffer) {
    final int utfOffset = readUnsignedShort(constantPoolEntryIndex);
    final int utfLength = readUnsignedShort(utfOffset);
    final int endOffset = utfOffset + 2 + utfLength;
    final byte[] bytes = new byte[utfLength];
    System.arraycopy(classFileBuffer, utfOffset + 2, bytes, 0, utfLength);
    return new String(bytes, StandardCharsets.UTF_8);
  }
}