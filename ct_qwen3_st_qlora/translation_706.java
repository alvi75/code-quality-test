import java.util.*;

public class Translation706 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < _elements.length;
    i++) {
        if (i > 0) {
            sb.append(", ");
        }
        sb.append(_elements[i].toString());
    }
    return sb.append(']').toString();
}
}