import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Object o : this) {
        if (sb.length() > 0) {
            sb.append( ", " );
        }
        sb.append(o);
    }
    return "[" + sb.toString() + "]";
}
}