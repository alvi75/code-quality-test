import java.util.*;

public class Translation126 {
    public void add(char[] output, int offset, int len, int endOffset, int posLength) {
    assert count < outputs.length : "out of order! count=" + count + " vs size=" + outputs.length;
    if (outputs[count] == null) {
        outputs[count] = new CharsRef();
    }
    outputs[count].copyChars(output, offset, len);
    ends[count] = endOffset;
    positions[count] = posLength;
    count++;
}
}