import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        if (byteArrayValue == null || byteArrayValue.length < 1)
            return this;
        ensureCapacity(byteLength);
        System.arraycopy(byteArrayValue, byteOffset, buf, pos, byteLength);
        pos += byteLength;
        return this;
    }
}