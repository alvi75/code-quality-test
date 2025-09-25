import java.util.*;

public class Translation188 {
    public int compareTo(ScoreTerm other) {
    if (term.bytesEquals(other.term))return 0;
    if (boost == other.boost)return term.compareTo(other.term);
    elsereturn Double.compare(boost, other.boost);
}
}