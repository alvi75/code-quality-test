import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    /**Read a signed long value.*/
    public long readLong(final int offset) {
        final byte[] data = this.data;
        return (((long)data[offset] & 0xffL) << 56)
                | (((long)(data[offset + 1]) & 0xffL) << 48)
                | (((long)(data[offset + 2]) & 0xffL) << 40)
                | (((long)(data[offset + 3]) & 0xffL) << 32)
                | (((long)(data[offset + 4]) & 0xffL) << 24)
                | ((data[offset + 5] & 0xffL) << 16)
                | ((data[offset + 6] & 0xffL) << 8)
                | (data[offset + 7] & 0xffL);
    }
}