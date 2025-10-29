import java.util.*;

public class Generated_6367670b1a6d9265ec017a0f {
    /**Check whether str contains elements in searchStrArray. If yes, true is returned. If no, false is returned.**/
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
        if(str==null || searchStrArray==null) return false;
        for(String searchStr:searchStrArray){
            if(str.equalsIgnoreCase(searchStr)) return true;
        }
        return false;
    }
}