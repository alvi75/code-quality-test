import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.**/
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() < 2)
            return str;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            char c = str.charAt(i);
            switch (c) {
                case '\\':
                    if (++i >= str.length())
                        throw new Exception("Invalid escape character at index " + i);
                    c = str.charAt(i);
                    switch (c) {
                        case 'b': sb.append('\b'); break;
                        case 't': sb.append('\t'); break;
                        case 'n': sb.append('\n'); break;
                        case 'f': sb.append('\f'); break;
                        case 'r': sb.append('\r'); break;
                        case '"': sb.append('"'); break;
                        case '\'': sb.append('\''); break;
                        case '\\': sb.append('\\'); break;
                        default:
                            if ((c >= '0' && c <= '7') || c == 'u') {
                                int j = i - 1;
                                do {
                                    if (c < '0' || c > '7')
                                        if (!(c == 'x' && j == i - 1))
                                            break;
                                    --j;
                                } while (--i >= 0 && i >= j);
                                i += (j + 1);
                                c = Integer.parseInt(str.substring(j + 1, i), 8);
                                sb.append((char) c);
                            }
                            else
                                throw new Exception("Invalid escape sequence at index " + (i - 1));
                    }
                    break;
                default: sb.append(c); break;
            }
        }
        return sb.toString();
    }
}