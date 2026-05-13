import java.util.*;

public class Translation27 {
    public boolean equals(Object object) {
    if (!(object instanceof FacetLabel)) {
        return false;
    }
    FacetLabel other = (FacetLabel) object;
    if (length != other.length) return false;
    for(int i=length-1;
    i>=0;
    i--) {
        if (!components[i].equals(other.components[i])) return false;
    }
    return true;
}
}