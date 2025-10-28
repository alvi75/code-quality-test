import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        final int newByteCount = byteCount + byteLength;
        ensureCapacity(newByteCount);
        System.arraycopy(byteArrayValue,byteOffset,newByteArray,byteCount,byteLength);
        byteCount += byteLength;
        return this;
    }
}