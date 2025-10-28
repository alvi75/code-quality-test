import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    public static Object findFirstMatch(Collection source,Collection candidates){
        for (Iterator it = candidates.iterator();it.hasNext();) {
            if (source.contains(it.next())) {
                return it.next();
            }
        }
        return null;
    }
}