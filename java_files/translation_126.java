import java.util.*;

public class Translation126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
    if (count == outputs.length) {
        charsRef = ArrayUtil.grow(charsRef, 1+count);
        offsets = ArrayUtil.grow(offsets, 1+count);
        lengths = ArrayUtil.grow(lengths, 1+count);
    }
    if (count == endOffsets.length) {
        endOffsets = ArrayUtil.grow(endOffsets, 1+count);
        backPos = ArrayUtil.grow(backPos, 1+count);
        backIndex = ArrayUtil.grow(backIndex, 1+count);
    }
    if (count == posLengths.length) {
        posLengths = ArrayUtil.grow(posLengths, 1+count);
        backPos[backIndex[count] = backPos[backIndex[count-1]] + 1;
        backIndex[backPos[backIndex[count]] = backIndex[backPos[backIndex[count-1]];
    }
    add(new CharsRef(output, offset, len), endOffset, posLength);
}
}