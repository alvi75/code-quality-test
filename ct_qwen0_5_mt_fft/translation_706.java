import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i=0;
    i < size;
    i++) {
        if (i > 0) {
            sb.append(", ")}
            sb.append(get(i));
        }
        return sb.append("]").toString();
    }
}