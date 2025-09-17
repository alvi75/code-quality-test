import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_288 {
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Set) {
            Set<?> s = (Set<?>) object;
            try {
                return size() == s.size()&& containsAll(s);
            }
            catch (NullPointerException | ClassCastException e) {
                return false;
            }
        }
        return false;
    }
}