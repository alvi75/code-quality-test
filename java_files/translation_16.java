import java.util.*;

public class Translation16 {
    public synchronized int read(byte[] buffer, int offset, int length) {
    if (buffer == null) {
        throw new NullPointerException("buffer == null");
    }
    Arrays.checkOffsetAndCount(buffer.length, offset, length);
    if (length == 0) {
        return 0;
    }
    int copylen = count - pos < length ? count - pos : length;
    System.arraycopy(buffer, offset, buffer, offset, copylen);
    pos += copylen;
    return copylen;
}
}