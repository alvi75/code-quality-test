import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.**/
final String readUtf(final int constantPoolEntryIndex,
                       final char[] charBuffer){
        if (constantPoolEntryIndex < 0 || constantPoolEntryIndex >= _classFileBuffer.length)
            throw new IllegalArgumentException("Invalid index: " + constantPoolEntryIndex);
        final int length = _classFileBuffer[constantPoolEntryIndex];
        if (length == 0) return "";
        final int start = constantPoolEntryIndex + 1;
        final int end = start + length;
        if (end > _classFileBuffer.length) {
            // This is a bug in the JVM.  The JVM should not be able to
            // access this part of the buffer.
            throw new IllegalStateException();
        }
        for (int i = start; i < end; ++i) {
            charBuffer[i - start] = _classFileBuffer[i];
        }
        return new String(charBuffer, 0, length);
    }
}