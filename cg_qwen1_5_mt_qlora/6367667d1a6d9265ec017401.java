import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.
@throws Exception if there is a problem with the string to be unescaped.
*/ public static String unescapeJava(String str) throws Exception {
        int len = str.length();
        StringBuffer sb = new StringBuffer(len);
        for (int i=0; i<len; i++) {
            char c = str.charAt(i);
            switch(c) {
                case 'n': sb.append('\n'); break;
                case 't': sb.append('\t'); break;
                case 'r': sb.append('\r'); break;
                case 'f': sb.append('\f'); break;
                case 'b': sb.append('\b'); break;
                case '\\':
                    if (++i < len && str.charAt(i) == 'u') {
                        // four hex digits, escape character
                        int u1 = Character.digit(str.charAt(++i), 16);
                        int u2 = Character.digit(str.charAt(++i), 16);
                        int u3 = Character.digit(str.charAt(++i), 16);
                        int u4 = Character.digit(str.charAt(++i), 16);
                        sb.append((char)((u1 << 12) | (u2 << 8) | (u3 << 4) | u4));
                    } else {
                        // backslash followed by something else, just append it
                        sb.append('\\');
                        sb.append(c);
                    }
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }
}