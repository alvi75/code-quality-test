import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
		if (str == null)
			return null;
		StringBuilder sb = new StringBuilder();
		int i, j;
		for (i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
				case '\\':
					sb.append(str.substring(i + 1, ++i));
					break;
				default:
					sb.append(c);
					break;
			}
		}
		return sb.toString();
	}
}