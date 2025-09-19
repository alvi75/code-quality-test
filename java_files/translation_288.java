import java.util.*;

public class Translation288 {
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
                for (int i = 0;
                i < size;
                i++) {
                    if (a[i] == o || (a[i] != null && a[i].equals(o))) {
                        index++;
                    }
                }
            }
            return index == size;
        }
        else {
            return false;
        }
    }
}