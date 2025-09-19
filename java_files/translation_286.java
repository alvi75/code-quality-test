import java.util.*;

public class Translation286 {
    public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (obj instanceof HSSFCellStyle) {
        final HSSFCellStyle other = (HSSFCellStyle) obj;
        if (index != other.index) {
            return false;
        }
        return true;
    }
}