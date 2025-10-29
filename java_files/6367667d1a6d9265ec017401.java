import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null) return null;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\\') {
                if (++i >= str.length()) throw new Exception("Invalid escape sequence");
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
                        if (++i >= str.length()) throw new Exception("Invalid escape sequence");
                        int hex = Integer.parseInt(str.substring(i, i + 4), 16);
                        sb.append((char) hex);
                        i += 3;
                        break;
                    default:
                        sb.append(c);
                        break;
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}