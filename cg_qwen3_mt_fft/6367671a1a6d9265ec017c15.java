import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteArrayValue == null)throw new NullPointerException();
		if(byteOffset < 0 || byteLength < 0 || byteOffset + byteLength > byteArrayValue.length)throw new IndexOutOfBoundsException();
		if(this.bytes.length - this.byteIndex < byteLength){
			enlargeBuffer(byteLength);
		}
		System.arraycopy(byteArrayValue,byteOffset,this.bytes,this.byteIndex,byteLength);
		this.byteIndex += byteLength;
		return this;
	}
}