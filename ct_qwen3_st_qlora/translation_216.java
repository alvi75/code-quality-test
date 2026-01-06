import java.util.*;

public class Translation216 {
    public static CharBuffer wrap(char[] array, int start, int remaining) {
    Arrays.checkOffsetAndCount(array.length, start, remaining);
    CharBuffer buf = new ReadWriteCharArrayBuffer(array);
    buf.position = start;
    buf.limit = start + remaining;
    return buf;
}
}