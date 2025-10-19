import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**
 * Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.
**/
final String readUtf(final int constantPoolEntryIndex,
                      final char[] charBuffer) {
    final int utfOffset = readUnsignedShort(constantPoolEntryIndex);
    final int utfLength = readUnsignedShort(utfOffset);
    final int utfEnd = utfOffset + 2 + utfLength;
    for (int i = 0; i < utfLength; ++i) {
      charBuffer[i] = (char)readUnsignedByte(utfOffset + 2 + i);
    }
    return new String(charBuffer, 0, utfLength);
  }
}