import java.util.*;

public class Translation288 {
    public boolean equals(Object o) {
    if ( this==o ) return true;
    if ( !(o instanceof Set) ) return false;
    Set<?> set = (Set<?>) o;
    try {
        return size()==set.size()&&containsAll(set);
    }
    catch (NullPointerException | ClassCastException e) {
        return false;
    }
}
}