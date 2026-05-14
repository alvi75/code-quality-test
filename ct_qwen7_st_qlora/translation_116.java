import java.util.*;

public class Translation116 {
    public boolean equals(Object o) {
    if (o == this) return true;
    if (!(o instanceof AutomatonQuery)) return false;
    AutomatonQuery other = (AutomatonQuery)o;
    return super.equals(o)&& this.compiled.equals(other.compiled)&& Objects.equal(this.term, other.term);
}
}