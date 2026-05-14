import java.util.*;

public class Translation188 {
    public int compareTo(ScoreTerm other) {
    if( Arrays.equals(term.bytes(),other.term.bytes()) ){
        return 0;
    }
    if (this.boost==other.boost)return other.term.compareTo(this.term);
    elsereturn Float.compare(this.boost,other.boost);
}
}