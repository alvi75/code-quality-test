import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
        if (offset < 0 || offset >= size - 1)
            throw new IllegalArgumentException("Bad offset: " + offset);
        final long end = offset + 8;
        if (end > limit)
            throw new BufferUnderflowException();
        return ((long) buffer[offset] & 0xff) << 56L
                | ((long) (buffer[offset + 1] & 0xff) << 48L)
                | ((long) (buffer[offset + 2] & 0xff) << 40L)
                | ((long) (buffer[offset + 3] & 0xff) << 32L)
                | ((long) (buffer[offset + 4] & 0xff) << 24L)
                | ((long) (buffer[offset + 5] & 0xff) << 16L)
                | ((long) (buffer[offset + 6] & 0xff) << 8L)
                | (buffer[offset + 7] & 0xffL);
    }
}