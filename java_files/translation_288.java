import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if ( this == object ) return true;
    if ( object instanceof Set ) {
        Set<?> s = (Set<?>) object;
        return size() == s.size() && containsAll(s);
    }
    return false;
}
}