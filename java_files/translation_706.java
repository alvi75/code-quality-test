import java.util.*;

public class Translation706 {
    ublic String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i=0;
    i<size;
    i++) {
        if (i>0) {
            sb.append(", ");
        }
    }
    return sb.append(']').toString();
}
}