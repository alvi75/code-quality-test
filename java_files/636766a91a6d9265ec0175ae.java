import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.**/
public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue == null || byteArrayValue.length == 0) return this;
        final int length = byteArrayValue.length;
        if(length > Integer.MAX_VALUE - byteOffset) {
            throw new IllegalArgumentException("byte array value is too long: " + byteArrayValue.length);
        }
        final int offset = byteOffset + (int) byteArrayValue.length;
        if(offset < 0 || offset > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("byte array value is too short: " + byteArrayValue.length);
        }
        final int lengthToCopy = Math.min(byteLength, length);
        System.arraycopy(byteArrayValue, 0, this.data, offset, lengthToCopy);
        return this;
    }
}