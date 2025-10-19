import java.util.*;

public class Generated_6367676c1a6d9265ec01820b {
    public static String deleteAny(String inString,String charsToDelete){
        if(inString == null || charsToDelete == null) return null;
        int i = 0;
        for(int j = 0; j < inString.length(); j++){
            char c = inString.charAt(j);
            if(charsToDelete.indexOf(c) != -1) continue;
            inString.setCharAt(i++,c);
        }
        return new String(inString.subSequence(0,i));
    }
}