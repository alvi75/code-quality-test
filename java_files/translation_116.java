import java.util.*;

public class Translation116 {
    public boolean equals(Object obj) {
    if (this == obj)return true;
    if (!super.equals(obj))return false;
    if (this.getClass()!=obj.getClass())return false;
    AutomatonQuery other=(AutomatonQuery)obj;
    if (!compiled.equals(other.compiled))return false;
    if (term==null) {
        if (other.term!=null)return false;
    }
    else if (!term.equals(other.term))return false;
    return true;
}
}