import java.util.*;

public class Translation677 {
    public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    FacetEntry that = (FacetEntry) o;
    return count == that.count && value.equals(that.value);
}
}