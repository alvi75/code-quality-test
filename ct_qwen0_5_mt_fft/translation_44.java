import java.util.*;

public class Translation44 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append(getPath());
    sb.append(":");
    sb.append(getComponent(0));
    for(int i=1;
    i<components.length;
    i++) {
        sb.append(':');
        sb.append(components[i]);
    }
    return sb.toString();
}
}