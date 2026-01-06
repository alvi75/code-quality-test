import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    /**Returns the first element in candidates that matches the source.**/
public static Object findFirstMatch(Collection source,Collection candidates){
        if (source == null) {
            throw new NullPointerException("source");
        }
        if (candidates == null) {
            throw new NullPointerException("candidates");
        }
        for (Object candidate : candidates) {
            if (source.contains(candidate)) {
                return candidate;
            }
        }
        return null;
    }
}