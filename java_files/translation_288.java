import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (object instanceof Set) {
        Set<?> s = (Set<?>) object;
        try {
            return size() == s.size()&& containsAll(s);
        }
        catch (NullPointerException e) {
            return false;
        }
    }
    return false;
}
}