import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        if (byteArrayValue == null) {
            throw new NullPointerException();
        }
        if ((byteOffset < 0) || (byteLength < 0) ||
                ((long)byteOffset + (long)byteLength > byteArrayValue.length)) {
            throw new IndexOutOfBoundsException();
        }

        // Put the length of the array.
        putInt(byteLength);

        // Put the array.
        for (int i = 0; i < byteLength; ++i) {
            buffer[pos++] = byteArrayValue[byteOffset + i];
        }
        return this;
    }
}