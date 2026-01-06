import java.util.*;

public class Generated_6367667d1a6d9265ec017401 {
    /**Unescapes Java that found in the String.**/
    public static String unescapeJava(String str) throws Exception {
        StringBuffer sb = new StringBuffer();
        int i = 0;
        while (i < str.length()) {
            char c = str.charAt(i);
            if (c == '\\') {
                // Escape sequence found, so get next character.
                char d = str.charAt(++i);
                // See if two digit escape sequence.
                if (d >= '0' && d <= '9') {
                    // Yes; get second digit of escape sequence.
                    char e = str.charAt(++i);
                    // Convert two digit number to integer.
                    int n = Integer.parseInt(d + "" + e);
                    // Append escaped character to buffer.
                    sb.append((char)n);
                } else {
                    // Not a two digit number, so append single
                    // character to buffer.
                    sb.append(c);
                }
            } else {
                // No escape sequence found, so just append the
                // character itself to the buffer.
                sb.append(c);
            }
            ++i;
        }
        return sb.toString();
    }
}