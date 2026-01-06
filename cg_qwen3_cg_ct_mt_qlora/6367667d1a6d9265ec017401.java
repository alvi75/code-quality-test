import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.**/
    public static String unescapeJava(String str) throws Exception {
        if (str == null) return null;
        StringBuffer sb = new StringBuffer();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (++i >= len) break;
                c = str.charAt(i);
                switch (c) {
                    case 'b': sb.append('\b'); break;
                    case 't': sb.append('\t'); break;
                    case 'n': sb.append('\n'); break;
                    case 'f': sb.append('\f'); break;
                    case 'r': sb.append('\r'); break;
                    case '\"': sb.append('"'); break;
                    case '\'': sb.append('\''); break;
                    case '\\': sb.append('\\'); break;
                    case 'u':
                        if (++i + 4 > len) throw new Exception("Invalid escape sequence: \\u");
                        String hex = str.substring(i, i+4);
                        try {
                            sb.append((char)Integer.parseInt(hex, 16));
                            i += 3;
                        } catch (NumberFormatException e) {
                            throw new Exception("Invalid escape sequence: \\u" + hex);
                        }
                        break;
                    default:
                        throw new Exception("Invalid escape sequence: \\" + c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}