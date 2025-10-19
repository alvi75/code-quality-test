import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
        if(source==null || candidates==null) return null;
        
        for(Object o : source){
            if(candidates.contains(o)) return o;
        }
        
        return null;
    }
}