import java.util.*;

public class Generated_636766a81a6d9265ec017595 {
    final ByteVector put11(final int byteValue1,final int byteValue2){
		if (byteValue1 < 0 || byteValue1 > 255) {
			throw new IllegalArgumentException("Byte value out of range: " + byteValue1);
		}
		if (byteValue2 < 0 || byteValue2 > 255) {
			throw new IllegalArgumentException("Byte value out of range: " + byteValue2);
		}
		byte[] b = new byte[2];
		b[0] = (byte) byteValue1;
		b[1] = (byte) byteValue2;
		put(b);
		return this;
	}
}