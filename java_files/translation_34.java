import java.util.*;

public class Translation34 {
    public static String quote(String string) {
    StringBuilder sb = new StringBuilder();
    sb.append('\\');
    int start = 0, i = 0;
    for (;
    i < string.length();
    i++) {
        switch (string.charAt(i)) {
            case '\\':case '*':case '?':case '{
                ':case '}
                ':case '(':case ')':case '[':case ']':case '\\':sb.append(string, start, i);
                sb.append('\\');
                start = i + 1;
                break;
            }
        }
        sb.append(string, start, i);
        return sb.toString();
    }
}