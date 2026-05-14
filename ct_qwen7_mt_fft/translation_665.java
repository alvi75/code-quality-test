import java.util.*;

public class Translation665 {
    public String toString() {
    final StringBuilder r = new StringBuilder();
    r.append("BlameResult[");
    if (path != null)r.append(path);
    elser r.append("null");
    r.append(", ");
    if (reverseStartCommit != null)r.append(reverseStartCommit.name());
    else r.append("(default)");
    //r.append(", ");
    if (forwardEndCommit != null) //r.append(forwardEndCommit.name());
    //else //r.append("(default)");
    //r.append(']');
    return r.toString();
}
}