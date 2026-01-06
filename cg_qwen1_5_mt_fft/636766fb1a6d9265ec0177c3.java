import java.util.*;

public class Generated_636766fb1a6d9265ec0177c3 {
    public static boolean isAscii(final char ch){
		if(ch < 0x80) {
			return true;
		}
		
		if(ch > 0xBF && ch < 0xED) {
			return true;
		}
		
		if(ch > 0xEF && ch < 0xF4) {
			return true;
		}
		
		return false;
	}
}