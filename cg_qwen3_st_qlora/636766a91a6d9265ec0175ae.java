import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**
 * Add a byte array into the byte vector.
**/
public ByteVector putByteArray(final byte[] byteArrayValue,
                                  final int byteOffset,
                                  final int byteLength) {
        if (byteArrayValue == null) {
            throw new NullPointerException("byteArrayValue");
        }
        if (byteOffset < 0 || byteOffset > byteArrayValue.length) {
            throw new IndexOutOfBoundsException();
        }
        if (byteLength < 0 || byteOffset + byteLength > byteArrayValue.length) {
            throw new IndexOutOfBoundsException();
        }

        ensureCapacity(byteLength);
        System.arraycopy(byteArrayValue, byteOffset, data, size, byteLength);
        size += byteLength;
        return this;
    }
}