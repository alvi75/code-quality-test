import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue==null){
            throw new IllegalArgumentException("byteArrayValue is null");
        }
        if(byteOffset<0){
            throw new IllegalArgumentException("byteOffset is negative");
        }
        if(byteLength<0){
            throw new IllegalArgumentException("byteLength is negative");
        }
        if(byteOffset+byteLength>byteArrayValue.length){
            throw new IllegalArgumentException("byteOffset+byteLength is larger than byteArrayValue.length");
        }
        if(byteLength>0){
            ensureCapacity(length+byteLength);
            System.arraycopy(byteArrayValue,byteOffset,buffer,length,byteLength);
            length+=byteLength;
        }
        return this;
    }
}