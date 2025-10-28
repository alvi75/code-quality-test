import java.util.*;

public class Generated_6367670b1a6d9265ec017a0f {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
        if(str == null || searchStrArray == null) return false;
        for(int i = 0; i < searchStrArray.size(); i++){
            String s = searchStrArray.get(i);
            if(s != null && str.contains(s)) return true;
        }
        return false;
    }
}