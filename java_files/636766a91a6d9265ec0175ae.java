import java.util.*;

public class Generated_636766a91a6d9265ec0175ae {
    public ByteVector putByteArray(final byte[] byteArrayValue,final int byteOffset,final int byteLength){
		if(byteArrayValue==null || byteArrayValue.length==0)
			return this;
		
		byte[] newBytes=Arrays.copyOfRange(byteArrayValue,byteOffset,byteOffset+byteLength);
		this.add(newBytes);
		return this;
	}
}