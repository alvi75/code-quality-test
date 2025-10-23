import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.*/
final String readUtf(final int constantPoolEntryIndex,
                      final char[] charBuffer) {
    final int utf8Length = readUnsignedShort(constantPoolEntryIndex);
    if (utf8Length > 0xFFFF) {
      throw new ClassFormatError("UTF-8 length is too big");
    }
    final int start = constantPoolEntryIndex + 2;
    final int end = start + utf8Length;
    for (int i = start; i < end; ++i) {
      charBuffer[i - start] = (char)readUnsignedByte(i);
    }
    return new String(charBuffer, 0, utf8Length);
  }
}