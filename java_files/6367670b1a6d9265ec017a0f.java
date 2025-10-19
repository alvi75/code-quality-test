import java.util.*;

public class Generated_6367670b1a6d9265ec017a0f {
    public static boolean containsAnyIgnoreCase(String str,List<String> searchStrArray){
        if(str == null || searchStrArray == null) return false;
        for (String s : searchStrArray) {
            if (str.toLowerCase().contains(s.toLowerCase())) return true;
        }
        return false;
    }
}