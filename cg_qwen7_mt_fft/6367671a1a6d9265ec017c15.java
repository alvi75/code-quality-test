import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteArrayValue == null) return this;
		
		int newLen = length() + byteLength;
		growTo(newLen);
		
		System.arraycopy(byteArrayValue,byteOffset,bytes,length(),byteLength);
		
		length(newLen);
		
		return this;
	}
}