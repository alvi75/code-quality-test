import java.util.*;

public class Translationtranslation_677 {
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FacetEntry other = (FacetEntry) o;
        if (count != other.count) return false;
        if (!value.equals(other.value)) return false;
        return true;
    }
}