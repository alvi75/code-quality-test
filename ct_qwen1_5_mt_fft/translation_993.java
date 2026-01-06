import java.util.*;

public class Translation993 {
    public String toString() {
    final StringBuilder s = new StringBuilder();
    s.append(Constants.typeString(type)).append(' ').append(name).append(' ').append(commitTime);
    appendCoreFlags(s);
    return s.toString();
}
}