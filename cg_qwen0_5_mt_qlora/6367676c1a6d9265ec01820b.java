import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
        if(inString == null || inString.length() == 0) return inString;
        if(charsToDelete == null || charsToDelete.length() == 0) return inString;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<inString.length();i++){
            char c = inString.charAt(i);
            if(!charsToDelete.contains(c.toString())) sb.append(c);
        }
        return sb.toString();
    }
}