import java.util.*;

public class Generated_636766f81a6d9265ec01775b {
    /**Read a signed long value.**/
	public long readLong(final int offset) {
		return (long)((byte)readByte(offset) << 56)
				| ((long)((short)readShort(offset + 1)) << 48)
				| ((long)((short)readShort(offset + 3)) << 40)
				| ((long)((short)readShort(offset + 5)) << 32)
				| ((long)((short)readShort(offset + 7)) << 24)
				| ((long)((short)readShort(offset + 9)) << 16)
				| ((long)((short)readShort(offset + 11)) << 8)
				| ((long)((short)readShort(offset + 13)));
	}
}