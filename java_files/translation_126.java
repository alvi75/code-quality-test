import java.util.*;

public class Translation126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
    if (count == outputs.length) {
        CharsRef[] next = new CharsRef[Math.max(count+1, 2*outputs.length)];
        System.arraycopy(outputs, 0, next, 0, count);
        outputs = next;
    }
    if (count == endOffsets.length) {
        int[] next = new int[Math.max(count+1, 2*endOffsets.length)];
        System.arraycopy(endOffsets, 0, next, 0, count);
        endOffsets = next;
    }
    if (count == posLengths.length) {
        int[] next = new int[Math.max(count+1, 2*posLengths.length)];
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