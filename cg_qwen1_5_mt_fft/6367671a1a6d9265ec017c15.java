import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,int byteOffset,int byteLength) {
        ensureCapacity(size + byteLength);
        System.arraycopy(byteArrayValue,byteOffset,this.data,size - byteLength,byteLength);
        size += byteLength;
        return this;
    }
}