import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    public long readLong(final int offset){
		final byte[] raw = new byte[8];
		readFully(raw, offset);
		return ByteBuffer.wrap(raw).getLong();
	}
}