import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    /**Read a signed long value.**/
    public long readLong(final int offset) {
        if (offset >= 0 && offset < size) {
            return ((long) buffer[offset] & 0xFF)
                    | ((long) buffer[offset + 1] & 0xFF) << 8
                    | ((long) buffer[offset + 2] & 0xFF) << 16
                    | ((long) buffer[offset + 3] & 0xFF) << 24
                    | ((long) buffer[offset + 4] & 0xFF) << 32
                    | ((long) buffer[offset + 5] & 0xFF) << 40
                    | ((long) buffer[offset + 6] & 0xFF) << 48
                    | ((long) buffer[offset + 7] & 0xFF) << 56;
        }
        throw new IndexOutOfBoundsException();
    }
}