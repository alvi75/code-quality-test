import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.*/
    public static String unescapeJava(String str) throws Exception {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '\\') {
                try {
                    c = str.charAt(++i);
                    switch (c) {
                        case 'u':
                            int uni = Integer.parseInt(str.substring(i + 1, i + 5), 16);
                            sb.append((char) uni);
                            i += 4;
                            break;
                        default:
                            sb.append(c);
                            break;
                    }
                } catch (NumberFormatException e) {
                    throw new Exception("Invalid escape sequence: \\"
                                        + c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}