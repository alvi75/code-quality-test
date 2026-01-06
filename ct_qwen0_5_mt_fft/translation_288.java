import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if ( this == object ) return true;
    if ( object instanceof Set ) {
        Set set = (Set) object;
        return size() == set.size() && containsAll(set);
    }
    return false;
}
}