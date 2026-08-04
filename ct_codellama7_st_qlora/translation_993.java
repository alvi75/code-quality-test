import java.util.*;

public class Translation993 {
    public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(Constants.typeString(getType()));
    s.append(' ');
    s.append(getName());
    s.append(' ');
    s.append(commitTime);
    s.append(' ');
    appendCoreFlags(s);
    return s.toString();
}
}