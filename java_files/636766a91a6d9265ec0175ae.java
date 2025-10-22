import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue == null) return this;
        final int length = byteArrayValue.length;
        if(byteOffset < 0 || byteOffset > length) throw new IndexOutOfBoundsException("byteOffset: " + byteOffset);
        if(byteLength < 0 || byteOffset + byteLength > length) throw new IndexOutOfBoundsException("byteLength: " + byteLength);
        final int oldLength = this.length;
        this.ensureCapacity(oldLength + byteLength);
        System.arraycopy(byteArrayValue,byteOffset,this.data,oldLength,byteLength);
        this.length += byteLength;
        return this;
    }
}