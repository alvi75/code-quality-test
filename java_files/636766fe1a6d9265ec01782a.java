import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                       final char[] charBuffer) {
        final int length = readUShort(constantPoolEntryIndex + 2);
        if (length == 0)
            return null;
        final int offset = constantPoolEntryIndex + 4;
        final StringBuilder sb = new StringBuilder(length);
        for (int i = 0; i < length; ++i) {
            sb.append(charBuffer[offset++]);
        }
        return sb.toString();
    }
}