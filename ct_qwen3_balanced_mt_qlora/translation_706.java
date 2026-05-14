import java.util.*;

public class Translation706 {
    ublic String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append('[');
    for (int i = 0;
    i < size;
    ++i) {
        if (i > 0)sb.append(", ");
        sb.append(elements[i]);
    }
    return sb.append(']').toString();
}
}