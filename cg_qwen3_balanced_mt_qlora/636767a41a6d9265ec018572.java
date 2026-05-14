import java.util.*;

public class Generated_636767a41a6d9265ec018572 {
    /**Read raw varint**/
	public long readRawVarint64() throws IOException {
		long result = 0L;
		int shift = 0;
		for (int bite; (bite = in.read()) >= 0;) {
			result |= ((long) (bite & 0x7F)) << shift;
			if ((bite & 0x80) == 0)
				return result;
			shift += 7;
		}
		throw new EOFException();
	}
}