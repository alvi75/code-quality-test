import java.util.*;

public class Translation993 {
    public String toString() {
    StringBuilder s = new StringBuilder();
    s.append(Constants.TYPE_STRING).append(" ");
    s.append(name).append(" ").append(commitTime).append(" ");
    appendCoreFlags(s);
    return s.toString();
}
}