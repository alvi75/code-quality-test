import java.util.*;

public class Generated_636766801a6d9265ec017487 {
    /**Encoding the given string by changing '{' and '}' to the specified character for each,return the string after encoding. **/
    public static String encodeTemplateNames(String s) {
        if (s == null || s.length() == 0)
            return "";
        StringBuilder sb = new StringBuilder();
        int i;
        char c;
        for (i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            switch (c) {
                case '{':
                    sb.append(encodeCharacter('{', 1));
                    break;
                case '}':
                    sb.append(encodeCharacter('}', 1));
                    break;
                default:
                    sb.append(c);
                    break;
            }
        }
        return sb.toString();
    }
}