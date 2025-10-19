import java.util.*;

public class Generated_636766f21a6d9265ec017667 {
    public short readShort(final int offset) {
        final byte[] bytes = new byte[2];
        this.classFileBuffer.get(bytes);
        return (short) ((bytes[0] & 0xFF) << 8) | (bytes[1] & 0xFF);
    }
}