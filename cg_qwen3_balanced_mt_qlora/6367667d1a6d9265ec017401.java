import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.**/
	public static String unescapeJava(String str) throws Exception {
		if (str == null || str.length() == 0)
			return str;

		StringBuffer sb = new StringBuffer();
		int len = str.length();

		for (int i = 0; i < len; i++) {
			char c = str.charAt(i);
			switch (c) {
				case '\\':
					i++;
					c = str.charAt(i);
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
						case 'u':
							String hexStr = str.substring(i + 1, i + 5);
							int hex = Integer.parseInt(hexStr, 16);
							sb.append((char) hex);
							i += 4;
							break;
						default:
							sb.append(c);
							break;
					}
					break;
				default:
					sb.append(c);
					break;
			}
		}

		return sb.toString();
	}
}