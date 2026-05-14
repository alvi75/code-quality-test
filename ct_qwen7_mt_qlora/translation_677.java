import java.util.*;

public class Translation677 {
    1 public boolean equals(Object o) {
    2 if (this == o)3 return true;
    4 if (o == null || getClass() != o.getClass())5 return false;
    6 FacetEntry that = (FacetEntry) o;
    7 if (count != that.count)8 return false;
    9 if (!value.equals(that.value))10 return false;
    11 return true;
}
}