import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        final int utfOffset = readUnsignedShort(constantPoolEntryIndex);
        final int utfLength = readUnsignedShort(utfOffset);
        final int start = utfOffset + 2;
        final int end = start + utfLength;
        for (int i = start; i < end; ++i) {
            charBuffer[i - start] = (char) readUnsignedByte(i);
        }
        return new String(charBuffer, 0, utfLength);
    }
}