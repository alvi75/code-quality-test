import java.util.*;

public class Generated_636766ff1a6d9265ec01784b {
    public static boolean isDigits(String str) {
		char c;
		for(int i=0; i<str.length(); ++i){
			c = str.charAt(i);
			if(c<'0'||c>'9') return false;
		}
		return true;
	}
}