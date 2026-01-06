import java.util.*;

public class Translation16 {
    @Override public int read(byte[] buffer, int offset, int length) {
    synchronized (mutex) {
        if (buffer == null) {
            throw new NullPointerException("buffer == null");
        }
        Arrays.checkOffsetAndCount(buffer.length, offset, length);
        if (length == 0) {
            return 0;
        }
        final int copyLen = count - pos < length ? count - pos : length;
        System.arraycopy(buffer, offset, buffer, pos, copyLen);
        pos += copyLen;
        return copyLen;
    }
}
}