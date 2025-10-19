import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    /**Read a signed long value.**/
public long readLong(final int offset){
        if (offset >= _length) {
            throw new IllegalArgumentException("Offset " + offset + " is beyond the end of the buffer");
        }
        final byte[] bytes = _buffer;
        return ((long)bytes[offset] & 0xFF) << 56 | ((long)bytes[offset + 1] & 0xFF) << 48 | ((long)bytes[offset + 2] & 0xFF) << 40 |
                ((long)bytes[offset + 3] & 0xFF) << 32 | ((long)bytes[offset + 4] & 0xFF) << 24 | ((long)bytes[offset + 5] & 0xFF) << 16 |
                ((long)bytes[offset + 6] & 0xFF) << 8 | ((long)bytes[offset + 7] & 0xFF);
    }
}