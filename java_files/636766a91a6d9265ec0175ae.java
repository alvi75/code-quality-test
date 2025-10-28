import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue == null || byteLength < 0) return this;
        final int newByteCount = byteCount + byteLength;
        ensureCapacity(newByteCount);
        System.arraycopy(byteArrayValue,byteOffset,newByteArray,byteCount,byteLength);
        byteCount += byteLength;
        return this;
    }
}