import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteArrayValue==null || byteArrayValue.length==0) return this;
		if(byteOffset<0 || byteLength<0 || byteOffset+byteLength>byteArrayValue.length)
			throw new IllegalArgumentException("Invalid arguments");
		int newSize=bytes.length+byteLength;
		byte[] newBytes=new byte[newSize];
		System.arraycopy(bytes, 0, newBytes, 0, bytes.length);
		System.arraycopy(byteArrayValue, byteOffset, newBytes, bytes.length, byteLength);
		bytes=newBytes;
		return this;
	}
}