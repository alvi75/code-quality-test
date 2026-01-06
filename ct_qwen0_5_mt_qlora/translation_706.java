import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < size();
    i++) {
        sb.append(get(i));
        if (i != size()-1) {
            sb.append(", ");
        }
    }
    return sb.append(']').toString();
}
}