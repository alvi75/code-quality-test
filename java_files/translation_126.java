import java.util.*;

public class Translationtranslation_126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
        if (count == outputs.length) {
            charsRef = ArrayUtil.grow(charsRef, 1+count);
            offsets = ArrayUtil.grow(offsets, 1+count);
            lengths = ArrayUtil.grow(lengths, 1+count);
        }
        if (count == endOffsets.length) {
            endOffsets = ArrayUtil.grow(endOffsets, 1+count);
            posLengths = ArrayUtil.grow(posLengths, 1+count);
        }
        if (count == posLengths.length) {
            posLengths = ArrayUtil.grow(posLengths, 1+count);
        }
        if (outputs[count-1] == null) {
            outputs[count-1] = new CharsRefBuilder();
        }
        pool.get(outputs[count-1], output, offset, len);
        endOffsets[count-1] = endOffset;
        posLengths[count-1] = posLength;
        count++;
    }
}