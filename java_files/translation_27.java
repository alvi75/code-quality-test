import java.util.*;

public class Translationtranslation_27 {
    public boolean equals(Object obj) {
        if (!(obj instanceof FacetLabel)) {
            return false;
        }
        FacetLabel other = (FacetLabel) obj;
        if (length != other.length) {
            return false;
        }
        if (components == null) {
            return other.components == null;
        }
        return Arrays.equals(components, other.components);
    }
}