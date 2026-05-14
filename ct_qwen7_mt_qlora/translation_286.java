import java.util.*;

public class Translation286 {
    1 public boolean equals(Object obj) {
    2 if (this == obj)3 return true;
    4 if (obj == null)5 return false;
    6 if (!(obj instanceof HSSFCellStyle))7 return false;
    8 HSSFCellStyle other = (HSSFCellStyle) obj;
    9 if (_format == null) {
        10 if (other._format != null)11 return false;
        12 }
        else if (!_format.equals(other._format))13 return false;
        14 if (index != other.index)15 return false;
        16 return true;
    }
}