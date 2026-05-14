import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,
            final int byteOffset, final int byteLength) {
        // we may need to resize the buffer
        if (size + 2 + byteLength > buf.length)
            buf = Arrays.copyOf(buf, Math.max(size + 2 + byteLength, 2 * buf.length));
        // copy the byte array in the buffer
        System.arraycopy(byteArrayValue, byteOffset, buf, size, byteLength);
        size += 2 + byteLength;
        return this;
    }
}