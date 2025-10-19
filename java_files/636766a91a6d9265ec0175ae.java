import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,
			final int byteOffset, final int byteLength) {
		if (byteArrayValue == null || byteArrayValue.length == 0)
			return this;
		byte[] newByteVector = new byte[byteLength + byteOffset];
		System.arraycopy(byteArrayValue, byteOffset, newByteVector, 0,
				byteLength);
		this.byteVector = newByteVector;
		return this;
	}
}