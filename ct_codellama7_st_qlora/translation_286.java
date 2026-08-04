import java.util.*;

public class Translation286 {
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    HSSFCellStyle other = (HSSFCellStyle) obj;
    if (format == null) {
        if (other.format != null) {
            return false;
        }
    }
    else if (!format.equals(other.format)) {
        return false;
    }
    if (index != other.index) {
        return false;
    }
    return true;
}
}