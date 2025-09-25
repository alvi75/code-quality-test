import java.util.*;

public class Translation993 {
    public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(Constants.typeString(type));
    s.append(' ');
    s.append(name);
    s.append(' ');
    s.append(commitTime);
    s.append(' ');
    appendCoreFlags(s);
    return s.toString();
}
}