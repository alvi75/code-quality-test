import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString, String charsToDelete) {
        if (inString == null || charsToDelete == null)
            return inString;
        else if (charsToDelete.length() == 0)
            return inString;

        StringBuilder outString = new StringBuilder();
        int index = 0;
        while ((index = inString.indexOf(charsToDelete, index)) != -1) {
            outString.append(inString.substring(index + charsToDelete.length()));
            index += charsToDelete.length();
        }
        outString.append(inString.substring(index));
        return outString.toString();
    }
}