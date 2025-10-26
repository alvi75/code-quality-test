import java.util.*;

public class Translation188 {
    public int compareTo(final ScoreTerm other) {
    if (term.bytesEqual(other.term)) {
        return 0;
    }
    if (boost == other.boost) {
        return other.term.compareTo(term);
    }
    else {
        return boost.compareTo(other.boost);
    }
}
}