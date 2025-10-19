import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset) {
        final byte[] bytes = new byte[8];
        if (offset < 0 || offset >= data.length)
            throw new IllegalArgumentException("Offset is out of bounds");
        System.arraycopy(data, offset, bytes, 0, 8);
        return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).longValue();
    }
}