import java.util.*;

public class Translationtranslation_126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
        if (count == outputs.length) {
            final CharsRef[] next = new CharsRef[ArrayUtil.oversize(1+count, Character.BYTES)];
            System.arraycopy(outputs, 0, next, 0, count);
            outputs = next;
        }
        if (count == endOffsets.length) {
            final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES)];
            System.arraycopy(endOffsets, 0, next, 0, count);
            endOffsets = next;
        }
        if (count == posLengths.length) {
            final int[] next = new int[ArrayUtil.oversize(1+count, Integer.BYTES)];
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