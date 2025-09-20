import java.util.*;

public class Translation288 {
    public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object instanceof Set)set = (Set)object;
    else if (!(object instanceof Iterator)) {
        return false;
    }
    Iterator<?> it = set.iterator();
    Object o;
    while (it.hasNext()) {
        o = it.next();
        if (!equals(o)) {
            return false;
        }
    }
    return true;
}
}