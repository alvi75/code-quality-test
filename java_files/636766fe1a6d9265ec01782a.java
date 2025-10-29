import java.util.*;

public class Generated_636766fe1a6d9265ec01782a {
    /**Read a CONSTANT_Utf8 constant pool entry in the classFileBuffer.**/
    final String readUtf(final int constantPoolEntryIndex,
                         final char[] charBuffer) {
        final int cpIdx = constantPoolEntryIndex - 1;
        if (cpIdx < 0) {
            return null;
        }
        final int cpLen = getConstantPoolLength(cpIdx);
        if (cpLen == 0) {
            return null;
        }
        final int cpStart = cpIdx + 1;
        final int cpEnd = cpStart + cpLen;
        final int cpOffset = getConstantPoolOffset(cpIdx);
        final int cpValue = getUnsignedShort(cpOffset);
        final int cpCharCount = cpValue & 0x7f;
        final int cpCharBufferOffset = cpOffset + 2;
        final int cpCharBufferLimit = cpCharBufferOffset + cpCharCount;
        for (int i = cpCharBufferOffset; i < cpCharBufferLimit; ++i) {
            charBuffer[i - cpStart] = (char) (charBuffer[i] & 0xff);
        }
        return new String(charBuffer, 0, cpCharBufferLimit);
    }
}