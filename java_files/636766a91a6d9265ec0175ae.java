import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue, final int byteOffset, final int byteLength) {
        if (byteArrayValue == null || byteArrayValue.length == 0) {
            throw new IllegalArgumentException("Byte vector cannot contain null or empty byte array");
        }
        if (byteLength < 0) {
            throw new IllegalArgumentException("Byte length must be non-negative");
        }

        // Check that we have enough room in the byte vector to hold this data.
        if (byteVectorSize + byteLength > byteVectorCapacity) {
            throw new IllegalStateException("Byte vector is full (" + byteVectorSize + " bytes). Cannot add more data.");
        }

        // Add the data to the end of the byte vector.
        System.arraycopy(byteArrayValue, byteOffset, byteVector, byteVectorSize, byteLength);

        // Update the size of the byte vector.
        byteVectorSize += byteLength;

        return this;
    }
}