import java.util.*;

public class Translation188 {
    public int compareTo(ScoreTerm other) {
    if (termBytesEquals(other.term)) return 0;
    if (boost == other.boost) return term.compareTo(other.term);
    else return boost.compareTo(other.boost);
}
}