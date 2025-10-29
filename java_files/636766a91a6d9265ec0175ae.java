import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.**/
public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteLength < 0 || byteLength > byteArrayValue.length - byteOffset){
            throw new IllegalArgumentException("byteLength must be >= 0 and <= " + byteArrayValue.length + " but was " + byteLength);
        }
        for(int i = 0; i < byteLength; ++i){
            putByte(byteArrayValue[byteOffset+i]);
        }
        return this;
    }
}