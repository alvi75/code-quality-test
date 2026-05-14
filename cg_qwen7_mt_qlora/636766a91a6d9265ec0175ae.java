import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
            final int byteOffset, final int byteLength) {
        if (byteArrayValue == null) {
            throw new NullPointerException();
        }
        if ((byteOffset | byteLength |
                (byteArrayValue.length - (byteOffset + byteLength))) < 0) {
            throw new IndexOutOfBoundsException();
        }

        ensureCapacity(this.size + byteLength);
        System.arraycopy(byteArrayValue, byteOffset, this.data, this.size,
                         byteLength);
        this.size += byteLength;
        return this;
    }
}