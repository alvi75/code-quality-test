import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    /**Put an array of bytes into this byte vector, enlarge the byte vector automatically if necessary.**/
	public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteArrayValue == null) {
			throw new NullPointerException("byteArrayValue");
		}
		if(byteOffset < 0 || byteOffset > byteArrayValue.length) {
			throw new ArrayIndexOutOfBoundsException();
		}
		if(byteLength < 0) {
			throw new IllegalArgumentException("byteLength");
		}
		final int newLength = this._length + byteLength;
		if(newLength > this._limit) {
			this._limit = newLength;
			this._array = ArrayUtil.copyOf(this._array, this._limit);
		}
		System.arraycopy(byteArrayValue, byteOffset, this._array, this._length, byteLength);
		this._length = newLength;
		return this;
	}
}