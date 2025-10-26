import java.util.*;

public class Translation188 {
    ublic int compareTo(ScoreTerm other) {
    if (termBytes.equals(other.termBytes)) {
        return 0;
    }
    if (boost == other.boost) {
        return termBytes.compareTo(other.termBytes);
    }
    else {
        return boost.compareTo(other.boost);
    }
}
}