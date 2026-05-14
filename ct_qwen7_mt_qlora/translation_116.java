import java.util.*;

public class Translation116 {
    1 public boolean equals(Object o) {
    2 if (o == this) return true;
    3 if (!(o instanceof AutomatonQuery)) return false;
    4 AutomatonQuery other = (AutomatonQuery)o;
    5 if (!compiled.equals(other.compiled)) return false;
    6 if (term == null) {
        7 if (other.term != null) return false;
        8 }
        else if (!term.equals(other.term))9 return false;
        10 return true;
    }
}