import java.util.*;

public class Translation993 {
    public String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(getClass().getSimpleName());
    s.append(" [");
    if (name != null) {
        s.append(name);
    }
    if (type != null) {
        s.append('(').append(type).append(')');
    }
    if (commitTime > -1) {
        s.append(" [").append(commitTime).append("]");
    }
    s.append("]");
    return s.toString();
}
}