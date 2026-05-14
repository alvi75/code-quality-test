import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        final ConstantPoolEntry cpe = getConstantPoolEntry(constantPoolEntryIndex);
        if (cpe == null || cpe.getTag() != ConstantPoolEntry.CONSTANT_Utf8) {
            throw new ClassfileFormatException("Invalid utf8 index: " + constantPoolEntryIndex);
        }
        return cpe.getUtf();
    }
}