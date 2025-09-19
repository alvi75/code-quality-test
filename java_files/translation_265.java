import java.util.*;

public class Translation265 {
    public final String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(getClass().getName()).append(" [ARRAY]\n");
    sb.append("range=").append(getRange()).append("\n");
    sb.append("size ").append(length()).append("\n");
    if (array != null) {
        sb.append("elements: ");
        for(int i=0;
        i<length;
        i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(array[ i ]);
        }
        sb.append("]");
    }
    else {
        sb.append("empty");
    }
    sb.append("]");
    return sb.toString();
}
}