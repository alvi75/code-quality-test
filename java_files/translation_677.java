import java.util.*;

public class Translation677 {
    @Override public boolean equals(Object o) {
    if ( this == o ) return true;
    if ( o == null || getClass() != o.getClass() ) return false;
    FacetEntry that = (FacetEntry) o;
    if ( count != that.count ) return false;
    if ( value.compareTo(that.value) != 0 ) return false;
    return true;
}
}