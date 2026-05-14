import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object instanceof Set) {
        Set<?> set = (Set<?>) object;
        try {
            return size() == set.size() && containsAll(set);
        }
        catch (ClassCastException e) {
            return false;
        }
        catch (NullPointerException e) {
            return false;
        }
    }
    return false;
}
}