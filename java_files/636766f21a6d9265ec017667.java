import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        final byte[] buffer = this.classFileBuffer;
        return (short)(buffer[offset] & 0xFF | ((buffer[offset + 1]) << 8));
    }
}