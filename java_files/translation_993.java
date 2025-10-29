import java.util.*;

public class Translation993 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(type.toString());
    sb.append(" ");
    sb.append(name);
    sb.append(" ");
    sb.append(commitTime);
    sb.append(" ");
    appendCoreFlags(sb);
    return sb.toString();
}
}