import java.util.*;

public class Translationtranslation_922 {
    public static String join(Collection<String> parts, String separator,String lastSeparator) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int lastIndex = parts.size() - 1;
        for(String part : parts) {
            if(i == lastIndex) {
                sb.append(part).append(lastSeparator);
            }
            else {
                sb.append(part).append(separator);
            }
        }
        return sb.toString();
    }
}