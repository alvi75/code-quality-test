import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.**/ 
    public ByteVector putByteArray(final byte[] byteArrayValue, final int byteOffset, final int byteLength) {
        ensureCapacity(byteArrayValue.length);
        System.arraycopy(byteArrayValue, byteOffset, _byteBuffer.array(), 0, byteLength);
        return this;
    }
}