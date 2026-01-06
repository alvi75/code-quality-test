import java.util.*;

public class Translation827 {
    @Override public boolean equals(Object other) {
    assert neverEquals(other);
    final Object[] o = (Object[]) other;
    if (o.length != size) {
        return false;
    }
    for (int i = 0;
    i < o.length;
    i++) {
        Object e = o[i];
        if (e == null && !containsNull || e != null && !e.equals(value)) {
            return false;
        }
    }
    return true;
}
}