import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_288 {
    @Override public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof Set) {
            Set<?> that = (Set<?>) object;
            int size = size();
            Object[] a = array;
            int index = 0;
            for (Object o : that) {
                if (o != null) {
                    for (int i = index;
                    i < size;
                    i++) {
                        if (a[i] == o || (a[i] != null && a[i].equals(o))) {
                            index = i + 1;
                            break;
                        }
                    }
                }
                else {
                    for (int i = index;
                    i < size;
                    i++) {
                        if (a[i] == null) {
                            index = i + 1;
                            break;
                        }
                    }
                }
                return size == that.size();
            }
            else {
                return false;
            }
        }
}