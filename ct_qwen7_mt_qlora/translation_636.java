import java.util.*;

public class Translation636 {
    1 public static String quoteReplacement(String s) {
    2 StringBuilder result = new StringBuilder(s.length());
    3 for (int i=0;
    i<s.length();
    i++) {
        4 char c = s.charAt(i);
        5 if (c == '\\' || c == '$')6 result.append('\\');
        7 result.append(c);
        8 }
        9 return result.toString();
    }
}