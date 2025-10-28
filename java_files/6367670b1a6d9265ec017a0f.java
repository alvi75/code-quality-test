import java.util.*;

public class Generated_6367670b1a6d9265ec017a0f {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
        if(str==null || searchStrArray==null) return false;
        
        for (String searchStr : searchStrArray)
            if(str.toLowerCase().contains(searchStr.toLowerCase())) return true;

        return false;
    }
}