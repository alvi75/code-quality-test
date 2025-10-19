import java.util.*;

public class Generated_636766fa1a6d9265ec01779d {
    public static boolean isAsciiControl(final char ch){
		if(ch < 0x20 && (ch > 0x09 || ch == 0x0A || ch == 0x0D)){
			return true;
		}
		return false;
	}
}