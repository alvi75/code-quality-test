import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
        for(Iterator i=candidates.iterator();i.hasNext();){
            Object candidate=i.next();
            if(source.contains(candidate)) return candidate;
        }
        return null;
    }
}