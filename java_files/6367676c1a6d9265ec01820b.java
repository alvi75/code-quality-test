import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    /**
     * Delete characters that exists in the intersection between two character strings of the first character string and return the first character string that is modified.
     */
    public static String deleteAny(String inString,String charsToDelete){
        if(inString==null || charsToDelete==null) return inString;
        
        StringBuffer out = new StringBuffer();
        for(int i=0;i<inString.length();i++){
            char c=inString.charAt(i);
            if(charsToDelete.indexOf(c)==-1)
                out.append(c);
        }
        return out.toString();
    }
}