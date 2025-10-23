import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        final int newLength = length + byteLength;
        if(newLength > limit) {
            grow(newLength);
        }
        System.arraycopy(byteArrayValue,byteOffset,buffer,length,byteLength);
        length = newLength;
        return this;
    }
}