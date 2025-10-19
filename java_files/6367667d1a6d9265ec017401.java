import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
		char[] chars = str.toCharArray();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '\\') {
				if (i + 1 < chars.length) {
					String hexString = null;
					if (chars[i + 1] == 'x') {
						hexString = "0x" + Character.toString(chars[i + 2]) + Character.toString(chars[i + 3]);
					} else if (chars[i + 1] == 'u') {
						hexString = "0x" + Character.toString(chars[i + 2]) + Character.toString(chars[i + 3])
								+ Character.toString(chars[i + 4]) + Character.toString(chars[i + 5]);
					}
					if (hexString != null) {
						sb.append((char) Integer.parseInt(hexString, 16));
						i += 5;
					} else {
						throw new Exception("Invalid escape sequence: \\" + chars[i + 1]);
					}
				} else {
					throw new Exception("Invalid escape sequence: \\" + chars[i + 1]);
				}
			} else {
				sb.append(chars[i]);
			}
		}

		return sb.toString();
	}
}