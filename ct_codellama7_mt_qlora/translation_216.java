import java.util.*;

public class Translation216 {
    public static CharBuffer wrap(char[] array, int start, int charCount) {
    Arrays.checkOffsetAndCount(array.length, start, charCount);
    CharBuffer buf = new ReadWriteCharArrayBuffer(array);
    buf._position = start;
    buf._limit = start + charCount;
    return buf;
}
}