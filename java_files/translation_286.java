import java.util.*;

public class Translationtranslation_286 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj instanceof HSSFCellStyle) {
            final HSSFCellStyle other = (HSSFCellStyle) obj;
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