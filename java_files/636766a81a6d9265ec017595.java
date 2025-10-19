import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
		final int needSize = this.size + 2;
		if(this.enlargeBuffer(needSize) == false){
			return null;
		}
		this.data[this.size++] = (byte)byteValue1;
		this.data[this.size++] = (byte)byteValue2;
		return this;
	}
}