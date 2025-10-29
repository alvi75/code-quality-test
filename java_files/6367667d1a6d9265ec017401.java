import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.**/
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() == 0) return str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                switch (str.charAt(++i)) {
                    case 'b': sb.append('\b'); break;
                    case 'f': sb.append('\f'); break;
                    case 'n': sb.append('\n'); break;
                    case 'r': sb.append('\r'); break;
                    case 't': sb.append('\t'); break;
                    case 'u':
                        int d1 = Character.digit(str.charAt(++i), 16);
                        int d2 = Character.digit(str.charAt(++i), 16);
                        int d3 = Character.digit(str.charAt(++i), 16);
                        int d4 = Character.digit(str.charAt(++i), 16);
                        if (d1 > 0 && d2 > 0 && d3 > 0 && d4 > 0) {
                            sb.append((char) ((d1 << 4) + d2));
                            sb.append((char) ((d3 << 4) + d4));
                        } else {
                            throw new Exception("Invalid escape sequence: " + str.substring(i, str.length()));
                        }
                        break;
                    default:
                        throw new Exception("Invalid escape sequence: " + str.substring(i, str.length()));
                }
            } else {
                sb.append(c);
            }
            ++i;
        }
        return sb.toString();
    }
}