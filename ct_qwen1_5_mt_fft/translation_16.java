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
    final int copylen = count - pos;
    if (copylen > length) {
        copylen = length;
    }
    System.arraycopy(this.buffer, pos, buffer, offset, copylen);
    pos += copylen;
    return copylen;
}
}