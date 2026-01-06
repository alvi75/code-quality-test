import java.util.*;

public class Generated_6367676b1a6d9265ec0181e2 {
    /**Returns the first element in candidates that matches the source.
@see #findMatches(Object, Collection)
@since 1.0
@deprecated Use {@link #findMatches} instead*/
public static Object findFirstMatch(Collection source,Collection candidates){
        return findMatches(source,candidates).iterator().next();
    }
}