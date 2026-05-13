import java.util.*;

public class Translation188 {
    1 public int compareTo(ScoreTerm other) {
    2 if (term.bytesEquals(other.term)) {
        3 return 0;
        4 }
        5 if (this.boost == other.boost) {
            6 return other.term.compareTo(this.term);
            7 }
            else {
                8 return Float.compare(this.boost, other.boost);
                9 }
            }
}