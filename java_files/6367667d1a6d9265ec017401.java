import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**
 * Unescapes Java that found in the String.
 **/
public static String unescapeJava(String str) throws Exception {
        if (str == null) return null;
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
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
                    case '\"':
                        sb.append('\"');
                        break;
                    case '\'':
                        sb.append('\'');
                        break;
                    case '\\':
                        sb.append('\\');
                        break;
                    case 'u': // unicode
                        i++;
                        int n = Integer.parseInt(str.substring(i, i + 4), 16);
                        sb.append((char)n);
                        i += 4;
                        break;
                    default:
                        throw new Exception("Invalid escape sequence: \\"
                                + c);
                }
            } else {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}