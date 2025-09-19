import java.util.*;

public class Translation993 {
    ublic String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(Constants.typeString(getType()));
    s.append(' ');
    s.append(name());
    s.append(' ');
    s.append(commitTime);
    s.append(' ');
    appendCoreFlags(s);
    return s.toString();
}
}