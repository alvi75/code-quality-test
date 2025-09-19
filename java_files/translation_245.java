import java.util.*;

public class Translation245 {
    public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null) return false;
    if (getClass() != obj.getClass()) return false;
    Toffs other = (Toffs) obj;
    if (getStartOffset() != other.getStartOffset()) return false;
    if (getEndOffset() != other.getEndOffset()) return false;
    return true;
}
}