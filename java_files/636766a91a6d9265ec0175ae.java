import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,int byteOffset,int byteLength) {
        ensureCapacity(size + byteLength);
        System.arraycopy(byteArrayValue,byteOffset,this.data,size,byteLength);
        size += byteLength;
        return this;
    }
}