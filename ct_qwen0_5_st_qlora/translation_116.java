import java.util.*;

public class Translation116 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (!super.equals(obj))return false;
    if (getClass() != obj.getClass())return false;
    AutomatonQuery other = (AutomatonQuery) obj;
    if (!Arrays.equals(term, other.term))return false;
    if (compiled != other.compiled)return false;
    return true;
}
}