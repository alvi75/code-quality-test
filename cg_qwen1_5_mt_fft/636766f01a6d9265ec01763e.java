import java.util.*;

public class Generated_636766f01a6d9265ec01763e {
    private static String javaCharset(String charset) {
        if (charset == null || charset.length() == 0)
            return null;
        // Try to find it in our map.
        String javaName = (String)javaNames.get(charset);
        if (javaName != null)
            return javaName;

        // Not found, try to create one from the first letter.
        char c = charset.charAt(0);
        for (int i=0; i<javaNames.size(); ++i) {
            javaName = (String)javaNames.elementAt(i);
            if (javaName.startsWith(c + "")) {
                javaName += charset.substring(1);
                javaNames.put(charset, javaName);
                return javaName;
            }
        }

        // Didn't work out...
        return null;
    }
}