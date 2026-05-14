import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.**/
final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        final ConstantUtf8Info utf8 = (ConstantUtf8Info)
                getConstantPoolEntry(constantPoolEntryIndex);
        return utf8.getUTF8String(charBuffer);
    }
}