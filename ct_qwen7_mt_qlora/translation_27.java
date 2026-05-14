import java.util.*;

public class Translation27 {
    2 public boolean equals(Object o) {
    3 if (!(o instanceof FacetLabel)) return false;
    4 final FacetLabel other = (FacetLabel) o;
    5 if (components.length != other.components.length) return false;
    6 for (int i = components.length - 1;
    i >= 0;
    --i)7 if (!components[i].equals(other.components[i]))8 return false;
    9 return true;
}
}