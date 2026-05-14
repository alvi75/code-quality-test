import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString, String charsToDelete) {
        if (inString == null || charsToDelete == null) {
            return inString;
        }
        int lastCharIndex = -1;
        for (int i = 0; i < inString.length(); i++) {
            char c = inString.charAt(i);
            if (charsToDelete.indexOf(c) != -1) {
                lastCharIndex = i;
            } else {
                break;
            }
        }

        if (lastCharIndex > 0) {
            return inString.substring(lastCharIndex + 1);
        } else {
            return inString;
        }
    }
}