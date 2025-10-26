import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (this == object) return true;
    if (!(object instanceof Set)) return false;
    Set<?> s = (Set<?>) object;
    try {
        return size() == s.size() && containsAll(s);
    }
    catch (NullPointerException e) {
        return false;
    }
    catch (ClassCastException e) {
        return false;
    }
}
}