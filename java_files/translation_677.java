import java.util.*;

public class Translation677 {
    01 public boolean equals(Object o) {
    02 if (this == o) return true;
    03 if (o == null || getClass() != o.getClass()) return false;
    04 FacetEntry that = (FacetEntry) o;
    05 if (count != that.count) return false;
    06 if (!value.equals(that.value)) return false;
    07 return true;
    08 }
}