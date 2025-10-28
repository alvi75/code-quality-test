import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
        if (inString == null || charsToDelete == null) {
            throw new IllegalArgumentException("Null input");
        }
        int len = inString.length();
        int lenCharsToDelete = charsToDelete.length();
        int index = 0;
        while ((index = inString.indexOf(charsToDelete, index)) != -1) {
            inString = inString.substring(0, index) + inString.substring(index + lenCharsToDelete);
            index += lenCharsToDelete;
        }
        return inString;
    }
}