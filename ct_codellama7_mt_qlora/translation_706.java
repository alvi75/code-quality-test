import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < this.size();
    i++) {
        if (sb.length() > 1) {
            sb.append(", ");
        }
        sb.append(this.get(i));
    }
    return sb.append(']').toString();
}
}