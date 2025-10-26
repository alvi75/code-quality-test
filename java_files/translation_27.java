import java.util.*;

public class Translation27 {
    public boolean equals(Object obj) {
    if (!(obj instanceof FacetLabel)) {
        return false;
    }
    FacetLabel other = (FacetLabel) obj;
    if (length() != other.length()) {
        return false;
    }
    for (int i = length() - 1;
    i >= 0;
    i--) {
        if (!components.get(i).equals(other.components.get(i), StringComparison . OrdinalIgnoreCase)) {
            return false;
        }
    }
    return true;
}
}