import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.*/
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength) {
        ensureCapacity(this.size + byteLength);
        System.arraycopy(byteArrayValue, byteOffset, this.buffer, this.size, byteLength);
        this.size += byteLength;
        return this;
    }
}