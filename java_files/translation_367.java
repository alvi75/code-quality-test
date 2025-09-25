import java.util.*;

public class Translation367 {
    public StringBuilder replace(int start, int end, String str) {
    str = str == null ? "" : str;
    if (start < 0 || end > length()) {
        throw new IndexOutOfBoundsException();
    }
    if (start == end) {
        return this;
    }
    int len = str.length();
    if (len == 0) {
        return this;
    }
    char[] buf = new char[end - start];
    System.arraycopy(_buf, start, buf, 0, len);
    _buf[start] = ' ';
    _buf[end] = ' ';
    _buf[end + 1] = '\u0000';
    _buf[end + 2] = '\u0000';
    _buf[end + 3] = '\u0000';
    _buf[end + 4] = '\u0000';
    _buf[end + 5] = '\u0000';
    _buf[end + 6] = '\u0000';
    _buf[end + 7] = '\u0000';
    _buf[end + 8] = '\u0000';
    _buf[end + 9] = '\u0000';
    _buf[end + 10] = '\u0000';
    _buf[end + 11] = '\u0000';
    _buf[end + 12] = '\u0000';
    _buf[end + 13] = '\u0000';
    _buf[end + 14] = '\u0000';
    _buf[end + 15] = '\u0000';
    _buf[end + 16] = '\u0000';
    _buf[end + 17] = '\u0000';
    _buf[end + 18] = '\u0000';
    _buf[end + 19] = '\u0000';
    _buf[end + 20] = '\u0000';
    _buf[end + 21] = '\u0000';
    _buf[end + 22] = '\u0000';
    _buf[end + 23] = '\u0000';
    _buf[end + 24] = '\u0000';
    _buf[end + 25] = '\u0000';
    _buf[end + 26] = '\u000
}