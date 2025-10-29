import java.util.*;

public class Translation286 {
    01 public boolean equals(Object obj) {
    02 if (this == obj) return true;
    03 if (obj == null) return false;
    04 if (obj instanceof HSSFCellStyle) {
        05 HSSFCellStyle other = (HSSFCellStyle) obj;
        06 if (_format == null) {
            07 if (other._format != null) return false;
            08 }
            else if (!_format.equals(other._format)) return false;
            09 if (index != other.index) return false;
            10 return true;
            11 }
            12 return false;
            13 }
}