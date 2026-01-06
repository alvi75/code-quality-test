import java.util.*;

public class Translation126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
    if (count == outputs.length) {
        final CharsRef[] next = new CharsRef[Math.min(outputs.length + 1, ARRAY_2_SIZE)];
        System.arraycopy(outputs, 0, next, 0, count);
        outputs = next;
    }
    if (count == endOffsets.length) {
        final int[] next = new int[Math.min(endOffsets.length + 1, ARRAY_2_SIZE)];
        System.arraycopy(endOffsets, 0, next, 0, count);
        endOffsets = next;
    }
    if (count == posLengths.length) {
        final int[] next = new int[Math.min(posLengths.length + 1, ARRAY_2_SIZE)];
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