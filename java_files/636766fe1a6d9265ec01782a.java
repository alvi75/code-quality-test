import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        // Read the UTF-16 encoding of the string.
        final int length = readU2BE(0);
        if (length == 0)
            return null;
        final byte[] bytes = new byte[length];
        for (int i = 0; i < length; ++i) {
            final int b = readU8();
            if ((b & 0x80) != 0) {
                throw new IllegalStateException("UTF-16 encoding not supported");
            }
            bytes[i] = (byte) b;
        }
        try {
            return new String(bytes, "UTF-16LE");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}