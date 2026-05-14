import java.util.*;

public class Generated_6367674f1a6d9265ec017e74 {
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<length(); ++i) {
            if (i > 0)
                sb.append(',');
            Object v = getValue(i);
            if (v == null)
                sb.append("null");
            else
                sb.append(v.toString());
        }
        return sb.toString();
    }
}