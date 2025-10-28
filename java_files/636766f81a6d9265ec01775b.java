import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
        if (offset + 8 > length) {
            throw new IllegalArgumentException("Offset " + offset + " is beyond the end of the stream");
        }
        final byte[] bytes = new byte[8];
        getBytes(offset, bytes);
        return ((long)bytes[0] << 56)
                | ((long)bytes[1] << 48)
                | ((long)bytes[2] << 40)
                | ((long)bytes[3] << 32)
                | ((long)bytes[4] << 24)
                | ((long)bytes[5] << 16)
                | ((long)bytes[6] << 8)
                | ((long)bytes[7]);
    }
}