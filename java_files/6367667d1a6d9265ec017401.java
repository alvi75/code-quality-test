import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() == 0)
            return str;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                i++;
                switch (c) {
                    case 'b':
                        sb.append('\b');
                        break;
                    case 'f':
                        sb.append('\f');
                        break;
                    case 'n':
                        sb.append('\n');
                        break;
                    case 'r':
                        sb.append('\r');
                        break;
                    case 't':
                        sb.append('\t');
                        break;
                    case '\'':
                        sb.append('\'');
                        break;
                    case '\"':
                        sb.append('"');
                        break;
                    case '\\':
                        sb.append('\\');
                        break;
                    default:
                        sb.append(c);
                }
            } else {
                sb.append(c);
            }
            i++;
        }
        return sb.toString();
    }
}