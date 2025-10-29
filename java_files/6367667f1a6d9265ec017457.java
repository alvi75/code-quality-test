import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int b = bb.get(i);
		if(b < 0x80) {
			sb.append((char)b);
			return i+1;
		}
		else if(b < 0xc0) {
			throw new IllegalArgumentException("Invalid UTF-8 encoding");
		}
		else if(b < 0xe0) {
			b = ((b & 0x1f) << 6) | (bb.get(i+1) & 0x3f);
			sb.append((char)b);
			return i+2;
		}
		else if(b < 0xf0) {
			b = ((b & 0x0f) << 12) | ((bb.get(i+1) & 0x3f) << 6) | (bb.get(i+2) & 0x3f);
			sb.append((char)b);
			return i+3;
		}
		else {
			b = ((b & 0x07) << 18) | ((bb.get(i+1) & 0x3f) << 12) | ((bb.get(i+2) & 0x3f) << 6) | (bb.get(i+3) & 0x3f);
			sb.append((char)(b >> 10 | 0xd800));
			sb.append((char)(b & 0x3ff | 0xdc00));
			return i+4;
		}
	}
}