import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString, String charsToDelete) {
        if (inString == null || charsToDelete == null) {
            return inString;
        }
        StringBuilder sb = new StringBuilder(inString);
        for (int i = 0; i < charsToDelete.length(); i++) {
            sb.deleteCharAt(sb.indexOf(charsToDelete.charAt(i)));
        }
        return sb.toString();
    }
}