import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    public static String encodeTemplateNames(String s) {
        int i;
        StringBuilder result = new StringBuilder();
        char ch;

        if (s == null)
            return "";
        else
            for (i = 0; i < s.length(); i++) {
                ch = s.charAt(i);
                switch (ch) {
                    case '{':
                        result.append(encodeBraceLeft);
                        break;
                    case '}':
                        result.append(encodeBraceRight);
                        break;
                    default:
                        result.append(ch);
                }
            }

        return result.toString();
    }
}