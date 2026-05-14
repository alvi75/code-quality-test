import java.util.*;

public class Translation126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
    if (count == outputs.length) {
        char[][] newArrays = new char[posLength*2][];
        System.arraycopy(outputs, 0, newArrays, 0, outputs.length);
        outputs = newArrays;
    }
    if (count == endOffsets.length) {
        int[] next = new int[posLength*2];
        System.arraycopy(endOffsets, 0, next, 0, endOffsets.length);
        endOffsets = next;
    }
    if (count == posLengths.length) {
        int[] next = new int[posLength*2];
        System.arraycopy(posLengths, 0, next, 0, posLengths.length);
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