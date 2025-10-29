import java.util.*;

public class Translation216 {
    0;
int charCount) {
    Arrays.checkOffsetAndCount(array_1.length, start, charCount);
    CharBuffer buf = new ReadWriteCharArrayBuffer(array_1);
    buf.position = start;
    buf.limit = start + charCount;
    return buf;
}
}