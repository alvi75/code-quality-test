import java.util.*;

public class Translation245 {
    ublic boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (obj == null) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    Toffs other = (Toffs)obj;
    if (startOffset != other.startOffset) {
        return false;
    }
    if (endOffset != other.endOffset) {
        return false;
    }
    return true;
}
}