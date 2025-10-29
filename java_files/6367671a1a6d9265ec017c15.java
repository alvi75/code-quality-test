import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.**/
    public ByteVector putByteArray(final byte[] byteArrayValue,
                                   final int byteOffset,
                                   final int byteLength){
        if(byteArrayValue == null) {
            throw new NullPointerException("byteArrayValue");
        }
        if(byteOffset < 0 || byteLength < 0 || byteOffset + byteLength > byteArrayValue.length) {
            throw new IllegalArgumentException("Invalid offset or length");
        }

        if(byteOffset + byteLength > this._length) {
            this.enlarge(byteOffset + byteLength);
        }

        System.arraycopy(byteArrayValue, byteOffset, this._data, this._length - byteLength, byteLength);

        return this;
    }
}