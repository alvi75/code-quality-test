import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
		StringBuffer sb = new StringBuffer();
		char c;
		int pos=0;
		while(pos<str.length()) {
			c=str.charAt(pos);
			if(c=='\\') {
				pos++;
				c=str.charAt(pos);
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
					case '\\':
						sb.append('\\');
						break;
					default:
						throw new Exception("Invalid escape sequence: "+c+" at position "+pos+" of string '"+str+"'");
				}
			} else {
				sb.append(c);
			}
			pos++;
		}
		return sb.toString();
	}
}