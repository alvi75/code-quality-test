import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        if (offset + 2 > buffer.length) {
            throw new IllegalArgumentException("Offset " + offset + " is out of bounds for length " + buffer.length);
        }
        return (short) ((buffer[offset] & 0xFF) << 8 | (buffer[offset + 1] & 0xFF));
    }
}