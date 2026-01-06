import java.util.*;

public class Generated_636766fd1a6d9265ec017814 {
    public static boolean arrayequals(byte[] a, byte[] b, int count){
		if (a == null || b == null || count < 0 || count > a.length - count) {
			return false;
		}
		for (int i = 0; i < count; i++) {
			if (a[i] != b[i]) {
				return false;
			}
		}
		return true;
	}
}