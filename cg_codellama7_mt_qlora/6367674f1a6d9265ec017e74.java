import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    public String toString() {
        if (this.value == null) {
            return "null";
        }
        if (this.value.length == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < this.value.length; i++) {
            if (i > 0) {
                sb.append(",");
            }
            sb.append(this.value[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}