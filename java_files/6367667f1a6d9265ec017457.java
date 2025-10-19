import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int j = i;
		while (j < i + 4 && bb.hasRemaining()) {
			j++;
		}
		if (j > i + 4) {
			throw new IllegalArgumentException("Invalid UTF-8: overlong encoding");
		}
		if (!bb.hasRemaining()) {
			return -1;
		}
		int c = bb.get() & 0xFF;
		if (c >= 0xF0) {
			sb.append((char) ((c & 7) << 12 | (bb.get() & 0x3F) << 6 | (bb.get() & 0x3F)));
		} else if (c >= 0xE0) {
			sb.append((char) ((c & 0xF) << 12 | (bb.get() & 0x3F) << 6 | (bb.get() & 0x3F)));
		} else if (c >= 0xC0) {
			sb.append((char) ((c & 0x1F) << 6 | (bb.get() & 0x3F)));
		} else {
			sb.append((char) c);
		}
		return j;
	}
}