import java.util.*;

public class Translation677 {
    public boolean equals(Object object) {
    if (object instanceof FacetEntry) {
        final FacetEntry other = (FacetEntry) object;
        return count == other.count && value.equals(other.value);
    }
    else {
        return false;
    }
}
}