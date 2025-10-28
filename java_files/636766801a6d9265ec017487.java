import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s) {
        if (s == null)
            return "";
        StringBuffer sb = new StringBuffer();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{') {
                sb.append('{');
            } else if (c == '}') {
                sb.append('}');
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}