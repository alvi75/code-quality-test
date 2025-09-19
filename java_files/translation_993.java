import java.util.*;

public class Translation993 {
    public String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(Constants.type);
    s.append(' ');
    s.append(name());
    s.append(' ');
    s.append(toStringTree(getChildren(), new ArrayList<String>()).toString());
    s.append(' ');
    appendFlags(s);
    return s.toString();
}
}