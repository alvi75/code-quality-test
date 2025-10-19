import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    /**Delete characters that exists in the intersection between two character strings of the first character string and return the first character string that is modified. **/
    public static String deleteAny(String inString,String charsToDelete){
        if(inString == null || inString.length() == 0){
            return "";
        }
        int index = inString.indexOf(charsToDelete);
        if(index != -1){
            inString = inString.substring(0, index) + inString.substring(index+charsToDelete.length());
        }
        return inString;
    }
}