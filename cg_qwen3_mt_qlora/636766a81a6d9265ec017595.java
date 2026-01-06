import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
		if (size + 2 > limit) {
			enlarge(2);
		}
		data.putByte(size++,byteValue1);
		data.putByte(size++,byteValue2);
		return this;
	}
}