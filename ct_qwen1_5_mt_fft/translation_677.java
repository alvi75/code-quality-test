import java.util.*;

public class Translation677 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (obj == null || getClass() != obj.getClass())return false;
    FacetEntry other = (FacetEntry)obj;
    if (count != other.count)return false;
    if (!value.equals(other.value))return false;
    return true;
}
}