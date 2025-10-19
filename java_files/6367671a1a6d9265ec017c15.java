import java.util.*;

public class Generated_6367671a1a6d9265ec017c15 {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteLength>0){
			byte[] newByteVector = new byte[byteValue.length+byteLength];
			System.arraycopy(byteValue,0,newByteVector,0,byteValue.length);
			System.arraycopy(byteArrayValue,byteOffset,newByteVector,byteValue.length,byteLength);
			this.byteValue=newByteVector;
		}
		return this;
	}
}