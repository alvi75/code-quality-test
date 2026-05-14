import java.util.*;

public class Translation27 {
    public boolean equals(Object o) {
    if (!(o instanceof FacetLabel)) return false;
    FacetLabel other = (FacetLabel)o;
    if (length() != other.length()) return false;
    for(int i=0;
    i<length();
    i++) {
        if (!components[i].equals(other.components[i])) return false;
    }
    return true;
}
}