import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString, String charsToDelete) {
        if (inString == null || inString.length() == 0 || charsToDelete == null)
            return inString;
        int len = charsToDelete.length();
        StringBuffer sb = new StringBuffer(inString);
        for (int i = 0; i < len; ++i) {
            char c = charsToDelete.charAt(i);
            sb.delete(sb.indexOf(new String(new char[]{c})),sb.indexOf(new String(new char[]{c})) + 1);
        }
        return sb.toString();
    }
}