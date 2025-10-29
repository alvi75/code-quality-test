import java.util.*;

public class Translation245 {
    01 public boolean equals(Object obj) {
    02 if (this == obj) return true;
    03 if (obj == null) return false;
    04 if (getClass() != obj.getClass()) return false;
    05 Toffs other = (Toffs) obj;
    06 if (startOffset != other.startOffset) return false;
    07 if (endOffset != other.endOffset) return false;
    08 return true;
    09 }
}