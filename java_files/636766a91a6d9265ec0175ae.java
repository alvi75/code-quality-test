import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength)
    {
        if (byteArrayValue == null) {
            throw new NullPointerException("byteArrayValue");
        }
        if (byteOffset < 0 || byteOffset > byteArrayValue.length) {
            throw new IllegalArgumentException(
                "byteOffset (" + byteOffset +
                ") is out of range for byte array of length " +
                byteArrayValue.length);
        }
        if (byteLength < 0 || byteOffset + byteLength > byteArrayValue.length) {
            throw new IllegalArgumentException(
                "byteLength (" + byteLength +
                ") is out of range for byte array of length " +
                byteArrayValue.length);
        }

        // If we're adding to the end of the buffer, just append it.
        if (byteOffset + byteLength == _byteBuffer.length) {
            System.arraycopy(byteArrayValue, byteOffset, _byteBuffer, _byteBuffer.length - byteLength, byteLength);
            _byteBufferLength += byteLength;
            return this;
        }

        // Otherwise, copy the bytes from the byte array into the buffer.
        System.arraycopy(byteArrayValue, byteOffset, _byteBuffer, _byteBufferLength, byteLength);

        // Update the length of the buffer.
        _byteBufferLength += byteLength;

        return this;
    }
}