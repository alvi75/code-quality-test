import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.**/
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        if (byteArrayValue == null) {
            throw new NullPointerException("byteArrayValue");
        }
        if (byteOffset < 0 || byteLength < 0) {
            throw new IllegalArgumentException(
                    "byteOffset: " + byteOffset + ", byteLength: " + byteLength);
        }
        if (byteOffset + byteLength > byteArrayValue.length) {
            throw new IllegalArgumentException(
                    "byteOffset: " + byteOffset + ", byteLength: " + byteLength +
                            ", byteArrayValue.length: " + byteArrayValue.length);
        }

        putInt(byteLength);
        putBytes(byteArrayValue, byteOffset, byteLength);

        return this;
    }
}