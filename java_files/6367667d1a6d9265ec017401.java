import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null)
            return null;
        int len = str.length();
        StringBuffer sb = new StringBuffer(len);
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            switch (ch) {
                case '\\':
                    if (++i >= len)
                        throw new IllegalArgumentException("Invalid escape sequence");
                    ch = str.charAt(i);
                    switch (ch) {
                        case 'b': sb.append('\b'); break;
                        case 'f': sb.append('\f'); break;
                        case 'n': sb.append('\n'); break;
                        case 'r': sb.append('\r'); break;
                        case 't': sb.append('\t'); break;
                        case '"': sb.append('"'); break;
                        case '\'': sb.append('\''); break;
                        case '\\': sb.append('\\'); break;
                        default:
                            if (Character.isISOControl(ch)) {
                                sb.append("\\u").append(Integer.toHexString(ch));
                            } else {
                                sb.append(ch);
                            }
                            break;
                    }
                    break;
                default:
                    sb.append(ch);
                    break;
            }
        }
        return sb.toString();
    }
}