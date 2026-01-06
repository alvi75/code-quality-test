import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        if (constantPool[constantPoolEntryIndex] != 0x75) {
            throw new ClassfileFormatException("Constant #" + constantPoolEntryIndex +
                    " is not utf");
        }
        // TODO: This assumes that all Utf8 entries have even length.
        //      Should we check for this?
        return new String(charBuffer, constantPoolOffset + constantPoolEntryIndex * 2, charBuffer.length - constantPoolEntryIndex * 2);
    }
}