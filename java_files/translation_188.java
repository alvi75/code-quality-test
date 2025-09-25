import java.util.*;

public class Translation188 {
    public final int compareTo(ScoreTerm other) {
    if (term.bytesEquals(other.term)) {
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