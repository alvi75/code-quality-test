import java.util.*;

public class Translation288 {
    1 public boolean equals(Object object) {
    2 if (this == object) {
        3 return true;
        4 }
        5 if (!(object instanceof Set)) {
            6 return false;
            7 }
            8 Set<?> s = (Set<?>) object;
            9 try {
                10 return this.size() == s.size() && containsAll(s);
                11 }
                catch (ClassCastException unused) {
                    // fall through12 }
                    catch (NullPointerException unused) {
                        // fall through13 }
                        14 return false;
                    }
}