import java.util.*;

public class Translation993 {
    public String toString() {
    final StringBuilder r = new StringBuilder();
    r.append(typeString(getType()));
    r.append(" ");
    r.append(name());
    r.append(" ");
    r.append(Long.toString(when / 1000L));
    r.append(" ");
    appendCoreFlags(r);
    return r.toString();
}
}