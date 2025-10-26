import java.util.*;

public class Translation116 {
    ublic boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }
    if (!super.equals(obj)) {
        return false;
    }
    if (getClass() != obj.getClass()) {
        return false;
    }
    AutomatonQuery other = (AutomatonQuery) obj;
    if (!term.equals(other.term)) {
        return false;
    }
    return true;
}
}