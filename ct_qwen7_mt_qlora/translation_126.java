import java.util.*;

public class Translation126 {
    1 public final void add(final char[] output,final int offset,final int len,final int endOffset,final int posLength) {
    2 if (count == outputs.length) {
        3 final CharsRef[] next = new CharsRef[ArrayUtil.oversize(1 + count, RamUsageEstimator.NUM_BYTES_OBJECT_REF)];
        4 System.arraycopy(outputs, 0, next, 0, count);
        5 outputs = next;
        6 }
        7 if (count == endOffsets.length) {
            8 final int[] next = new int[ArrayUtil.oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
            9 System.arraycopy(endOffsets, 0, next, 0, count);
            10 endOffsets = next;
            11 }
            12 if (count == posLengths.length) {
                13 final int[] next = new int[ArrayUtil.oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
                14 System.arraycopy(posLengths, 0, next, 0, count);
                15 posLengths = next;
                16 }
                17 if (outputs[count] == null) {
                    18 outputs[count] = new CharsRef();
                    19 }
                    20 outputs[count].copyChars(output, offset, len);
                    21 endOffsets[count] = endOffset;
                    22 posLengths[count] = posLength;
                    23 count++;
                }
}