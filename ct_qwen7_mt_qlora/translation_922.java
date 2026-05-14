import java.util.*;

public class Translation922 {
    2 public static String join(Collection<String> parts, String separator, String lastSeparator) {
    3 StringBuilder sb = new StringBuilder();
    4 int i = 0;
    5 int lastIndex = parts.size() - 1;
    6 for (String part : parts) {
        7 sb.append(part);
        8 if (i == lastIndex - 1) {
            9 sb.append(lastSeparator);
            10 }
            else {
                11 if (i != lastIndex) {
                    12 sb.append(separator);
                    13 }
                    14 }
                    15 i++;
                    16 }
                    17 return sb.toString();
                }
}