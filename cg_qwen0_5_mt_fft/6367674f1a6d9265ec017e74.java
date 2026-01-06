import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    public String toString() {
        if (this == ZERO) return "0";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.length(); i++) {
            int v = get(i);
            if (v != 0)
                sb.append(v);
        }
        return sb.toString();
    }
}