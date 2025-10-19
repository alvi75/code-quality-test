import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        final int utfOffset = getConstantPoolEntryOffset(constantPoolEntryIndex);
        final int utfLength = getConstantPoolEntryLength(constantPoolEntryIndex);

        if (utfLength > charBuffer.length) {
            throw new IllegalArgumentException("charBuffer too small");
        }

        // Read the UTF-8 string into the buffer.
        System.arraycopy(classFileBuffer, utfOffset + 3, charBuffer, 0, utfLength);

        return new String(charBuffer, 0, utfLength);
    }
}