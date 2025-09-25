import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < _values.length;
    i++) {
        if (i > 0) {
            sb.append(", ");
        }
        sb.append(_values[i]);
    }
    return sb.append(']').toString();
}
}