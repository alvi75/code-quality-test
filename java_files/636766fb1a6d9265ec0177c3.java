import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch){
		if(ch>0x7f) {
			return false;
		}
		if(Character.isWhitespace(ch)) {
			return false;
		}
		return true;
	}
}