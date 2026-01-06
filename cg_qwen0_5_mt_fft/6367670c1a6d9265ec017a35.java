import java.util.*;

public class Generated_6367670c1a6d9265ec017a35 {
    private static boolean endsWith(final String str,final String suffix,final boolean ignoreCase){
		if (ignoreCase) {
			return str.endsWith(suffix);
		} else {
			return str.regionMatches(str.length() - suffix.length(), suffix, 0, suffix.length());
		}
	}
}