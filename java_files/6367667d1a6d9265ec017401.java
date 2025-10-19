import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    public static String unescapeJava(String str) throws Exception {
        if (str == null || str.length() == 0)
            return str;
        StringBuffer sb = new StringBuffer();
        int len = str.length();

        for (int i = 0; i < len; ) {
            char c = str.charAt(i);
            switch (c) {
                case '\\':
                    ++i;
                    if (len <= i)
                        throw new Exception("Invalid escape sequence");
                    c = str.charAt(i);
                    switch (c) {
                        case 'b': c = '\b'; break;
                        case 't': c = '\t'; break;
                        case 'n': c = '\n'; break;
                        case 'f': c = '\f'; break;
                        case 'r': c = '\r'; break;
                        case '"': c = '\"'; break;
                        case '\'': c = '\''; break;
                        case 'u':
                            ++i;
                            if (len <= i + 4)
                                throw new Exception("Invalid unicode escape sequence");
                            int u1 = Character.digit(str.charAt(++i), 16);
                            int u2 = Character.digit(str.charAt(++i), 16);
                            int u3 = Character.digit(str.charAt(++i), 16);
                            int u4 = Character.digit(str.charAt(++i), 16);
                            if ((u1 | u2 | u3 | u4) < 0)
                                throw new Exception("Invalid unicode escape sequence");
                            c = (char)((u1 << 12) + (u2 << 8) + (u3 << 4) + u4);
                            break;
                        default:
                            // should be a hex digit, but not necessarily
                            // a valid one.
                            try {
                                c = (char)(Character.digit(c, 16));
                            } catch (Exception e) {
                                // ignore this character
                            }
                            break;
                    }
                    break;
                default:
                    break;
            }

            sb.append(c);
            ++i;
        }

        return sb.toString();
    }
}