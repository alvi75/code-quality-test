import java.util.*;

public class Translation188 {
    public int compareTo(ScoreTerm other) {
    if (term.bytesEquals(other.term)) {
        return 0;
    }
    if (this.boost == other.boost) {
        return other.term.compareTo(this.term);
    }
    else {
        return Float.compare(this.boost, other.boost);
    }
}
}