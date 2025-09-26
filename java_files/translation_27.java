import java.util.*;

public class Translation27 {
    2 public boolean equals(Object o) {
    if (!(o instanceof FacetLabel)) {
        return false;
    }
    FacetLabel other = (FacetLabel)o;
    if (length != other.length) {
        return false;
    }
    for (int i = length - 1;
    i >= 0;
    i--) {
        if (!components[i].equals(other.components[i])) {
            return false;
        }
    }
    return true;
}
}