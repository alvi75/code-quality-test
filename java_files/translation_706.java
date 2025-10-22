import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (Object item : this) {
        if (sb.length() > 1) {
            sb.append(", ");
        }
        sb.append(item);
    }
    return sb.append(']').toString();
}
}