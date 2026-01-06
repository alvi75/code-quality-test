import java.util.*;

public class Translation677 {
    public boolean equals(Object o) {
    if (this == o)return true;
    if (o == null || getClass() != o.getClass())return false;
    FacetEntry that = (FacetEntry)o;
    if (count != that.count)return false;
    if (!value.equals(that.value))return false;
    return true;
}
}