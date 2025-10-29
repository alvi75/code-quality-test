import java.util.*;

public class Translation126 {
    ublic void add(char[] output, int offset, int len, int endOffset, int posLength) {
    if (count == outputs.length) {
        CharsRef[] next = new CharsRef[ArrayUtil.Oversize(1 + count, RamUsageEstimator.NUM_BYTES_OBJECT_REF)];
        System.arraycopy(outputs, 0, next, 0, count);
        outputs = next;
    }
    if (count == endOffsets.length) {
        int[] next = new int[ArrayUtil.Oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
        System.arraycopy(endOffsets, 0, next, 0, count);
        endOffsets = next;
    }
    if (count == posLengths.length) {
        int[] next = new int[ArrayUtil.Oversize(1 + count, RamUsageEstimator.NUM_BYTES_INT32)];
        System.arraycopy(posLengths, 0, next, 0, count);
        posLengths = next;
    }
    if (outputs[count] == null) {
        outputs[count] = new CharsRef();
    }
    outputs[count].copyChars(output, offset, len);
    endOffsets[count] = endOffset;
    posLengths[count] = posLength;
    count++;
}
}