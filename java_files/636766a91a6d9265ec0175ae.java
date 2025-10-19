import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    /**Add a byte array into the byte vector.**/
	public ByteVector putByteArray(final byte[] byteArrayValue, final int byteOffset, final int byteLength){
		if(byteArrayValue == null || byteArrayValue.length < byteOffset + byteLength)
			throw new IllegalArgumentException("byte array length is not enough to add " + byteLength + " bytes");
		this.byteVector.putByteArray(byteArrayValue, byteOffset, byteLength);
		return this;
	}
}