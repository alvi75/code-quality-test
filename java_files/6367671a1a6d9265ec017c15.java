import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.**/
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
        if(byteArrayValue.length<(byteOffset+byteLength))
            throw new IllegalArgumentException("The length of the specified array is not enough.");
        if(byteLength<0)
            throw new IllegalArgumentException("The length of the specified array is not valid.");

        putInt(byteLength);
        putByteArrayNoSize(byteArrayValue,byteOffset,byteLength);

        return this;
    }
}