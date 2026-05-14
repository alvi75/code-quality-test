import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.**/
	public ByteVector putByteArray(final byte[] byteArrayValue,
			final int byteOffset, final int byteLength) {
		if (byteArrayValue == null) {
			return this;
		}
		if (byteOffset < 0 || byteOffset > byteArrayValue.length) {
			throw new ArrayIndexOutOfBoundsException(byteOffset);
		}
		if (byteLength < 0 || byteOffset + byteLength > byteArrayValue.length) {
			throw new ArrayIndexOutOfBoundsException(byteOffset + byteLength);
		}
		if (byteOffset == byteArrayValue.length && byteLength == 0) {
			return this;
		}

		int newLength = this._limit + byteLength;
		if (newLength > this._capacity) {
			this.grow(newLength);
		}
		System.arraycopy(byteArrayValue, byteOffset, this._array, this._limit,
				byteLength);
		this._limit += byteLength;
		return this;
	}
}