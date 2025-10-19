import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
        final byte[] buffer = this.buffer;
        int pos = offset / 8;
        if (pos >= buffer.length)
            throw new IllegalArgumentException("offset " + offset + " is out of bounds for file size " + buffer.length);
        return ((long)buffer[pos] & 0xFF) << 24 | ((long)buffer[pos + 1] & 0xFF) << 16 | ((long)buffer[pos + 2] & 0xFF) << 8 | (long)buffer[pos + 3] & 0xFF;
    }
}