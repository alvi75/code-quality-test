import java.util.*;

public class Translation286 {
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (obj instanceof HSSFSpecialColor) {
        HSSFSpecialColor other = (HSSFSpecialColor)obj;
        if (getFormat() == null) {
            if (other.getFormat() != null)return false;
        }
        else if (!getFormat().equals(other.getFormat()))return false;
        if (getIndex() != other.getIndex())return false;
        return true;
    }
    return false;
}
}