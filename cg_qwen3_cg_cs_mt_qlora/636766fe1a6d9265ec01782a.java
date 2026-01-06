import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex, final char[] charBuffer) {
        final int index = getConstantPoolEntryIndex(constantPoolEntryIndex);
        if (index < 0) {
            return null;
        }
        final int utfLength = classFileBuffer.get(index + 1);
        final int utfOffset = index + 2;
        final int stringOffset = utfOffset + utfLength;
        final String result = new String(classFileBuffer.array(), utfOffset, utfLength, StandardCharsets.UTF_8);
        if (charBuffer != null && charBuffer.length >= result.length()) {
            result.getChars(0, result.length(), charBuffer, 0);
        }
        return result;
    }
}