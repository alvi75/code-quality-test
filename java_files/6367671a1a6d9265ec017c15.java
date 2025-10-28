import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue, final int byteOffset, final int byteLength) {
        if (byteArrayValue == null || byteArrayValue.length == 0) {
            throw new NullPointerException("byteArrayValue");
        }
        if (byteLength < 0) {
            throw new IllegalArgumentException("byteLength must be >= 0");
        }

        // check bounds
        if (byteOffset + byteLength > byteArrayValue.length) {
            throw new IndexOutOfBoundsException();
        }

        // allocate a new byte vector if necessary
        if (byteSize + byteLength > size) {
            grow(byteSize + byteLength);
        }

        // copy the data
        System.arraycopy(byteArrayValue, byteOffset, data, byteSize, byteLength);

        // update the size
        byteSize += byteLength;

        return this;
    }
}