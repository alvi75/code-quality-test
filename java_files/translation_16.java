import java.util.*;

public class Translation16 {
    public int read(byte[] buffer, int offset, int length) throws IOException {
    synchronized (Lock.this) {
        if (buffer == null) {
            throw new NullPointerException();
        }
        Arrays.checkOffsetAndCount(buffer.length, offset, length);
        if (length == 0) {
            return 0;
        }
        final int copylen = count - pos < length ? count - pos : length;
        for (int i = 0;
        i < copylen;
        i++) {
            buffer[offset + i] = buffer[pos + i];
        }
        pos += copylen;
        return copylen;
    }
}
}