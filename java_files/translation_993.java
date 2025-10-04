import java.util.*;

public class Translation993 {
    public String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(Constants.typeString(getType()));
    s.append(' ');
    s.append(name());
    s.append(' ');
    appendCoreFlags(s);
    return s.toString();
}
}