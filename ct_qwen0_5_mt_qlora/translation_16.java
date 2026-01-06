import java.util.*;

public class Translation16 {
    public synchronized int read(byte[] buffer, int offset, int length) {
    if (buffer == null) {
        throw new NullPointerException("buffer == null");
    }
    final int len = count - pos;
    if (length == 0) {
        return 0;
    }
    if (length > len) {
        length = len;
    }
    System.arraycopy(buffer, 0, buffer, offset, length);
    pos += length;
    return length;
}
}