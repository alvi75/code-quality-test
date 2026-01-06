import java.util.*;

public class Generated_6367667f1a6d9265ec017457 {
    /**
 * Decode octets to characters with UTF-8, append them to the given StringBuilder, and return the index to the next unchecked character.
 */
private static int decodeOctets(int i,ByteBuffer bb,StringBuilder sb){
		int c = 0;
		if(i < 128) {
			c = i;
		} else if(i < 2048) {
			c = (i >> 6) | 192;
			sb.append((char)c);
			c = (i & 63) | 128;
			sb.append((char)c);
		} else {
			c = (i >> 12) | 224;
			sb.append((char)c);
			c = ((i >> 6) & 63) | 128;
			sb.append((char)c);
			c = (i & 63) | 128;
			sb.append((char)c);
		}
		return c;
	}
}