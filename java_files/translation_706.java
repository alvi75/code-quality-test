import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < this.length();
    i++) {
        if (i > 0) {
            sb.append(", ");
        }
        sb.append(this.getComponent(i).toString());
    }
    sb.append(']');
    return sb.toString();
}
}