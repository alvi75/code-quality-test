import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
		final byte[] bytes = new byte[8];
		readBytes(bytes, offset);
		return ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN).getLong();
	}
}