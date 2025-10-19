import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue, final int byteOffset, final int byteLength) {
        if (byteArrayValue == null)
            throw new NullPointerException("byte array value cannot be null");
        if (byteOffset < 0 || byteLength < 0 || byteOffset + byteLength > byteArrayValue.length)
            throw new ArrayIndexOutOfBoundsException();
        this.array[this.offset + this.size] = byteArrayValue;
        this.size += byteLength;
        this.offset += byteLength;
        return this;
    }
}