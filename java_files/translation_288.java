import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (this == object) return true;
    if (object instanceof Set) {
        Set<?> s = (Set<?>) object;
        boolean equalSoFar = true;
        Object nextElement;
        while (equalSoFar && (nextElement = s.next()) != null) {
            equalSoFar = this.equal(nextElement, s.iterator());
        }
        return equalSoFar;
    }
    return false;
}
}