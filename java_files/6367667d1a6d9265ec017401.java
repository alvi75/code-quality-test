import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() == 0)
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\\') {
                c = str.charAt(++i);
                switch (c) {
                    case 'b':
                        sb.append('\u0008');
                        break;
                    case 't':
                        sb.append('\u0009');
                        break;
                    case 'n':
                        sb.append('\u000a');
                        break;
                    case 'f':
                        sb.append('\u000c');
                        break;
                    case 'r':
                        sb.append('\u000d');
                        break;
                    case 'x':
                        c = str.charAt(++i);
                        if (c >= '0' && c <= '9')
                            c = (char) ((c - '0') * 16 + (str.charAt(++i) - '0'));
                        else if (c >= 'a' && c <= 'f')
                            c = (char) ((c - 'a') * 16 + (str.charAt(++i) - 'a'));
                        else if (c >= 'A' && c <= 'F')
                            c = (char) ((c - 'A') * 16 + (str.charAt(++i) - 'A'));
                        sb.append((char) c);
                        break;
                    default:
                        throw new Exception("Unknown escape sequence: " + c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}