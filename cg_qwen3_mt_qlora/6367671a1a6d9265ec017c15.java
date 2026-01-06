import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.*/
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        ensureCapacity(byteArrayValue.length + size);
        System.arraycopy(byteArrayValue, byteOffset, buffer, size, byteLength);
        size += byteLength;
        return this;
    }
}