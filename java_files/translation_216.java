import java.util.*;

public class Translation216 {
    ublic static CharBuffer wrap(char[] array, int start, int charCount) {
    Arrays.checkOffsetAndCount(array.length, start, charCount);
    CharBuffer buf = new ReadWriteCharArrayBuffer(array);
    buf.position = start;
    buf.limit = start + charCount;
    return buf;
}
}