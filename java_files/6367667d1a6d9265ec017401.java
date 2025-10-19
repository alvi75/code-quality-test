import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
		if (str == null || str.length() == 0)
			return str;
		StringBuffer sb = new StringBuffer();
		int i = 0, j = 0;
		char c = 0;
		while (i < str.length()) {
			c = str.charAt(i);
			if (c == '\\') {
				j++;
				if (j > 1)
					sb.append(c);
				if (j % 2 == 0) {
					switch (c) {
						case 'b':
							sb.append('\b');
							break;
						case 't':
							sb.append('\t');
							break;
						case 'n':
							sb.append('\n');
							break;
						case 'f':
							sb.append('\f');
							break;
						case 'r':
							sb.append('\r');
							break;
						case '\"':
							sb.append('"');
							break;
						case '\'':
							sb.append('\'');
							break;
						case '\\':
							sb.append('\\');
							break;
						default:
							throw new Exception("Invalid escape character: " + c);
					}
				}
			} else {
				sb.append(c);
			}
			i++;
		}
		return sb.toString();
	}
}