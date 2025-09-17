import java.util.*;

public class Translationtranslation_706 {
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (Object o : this) {
            if (sb.length() > 1)sb.append(", ");
            sb.append(o.toString());
        }
        return sb.append(']').toString();
    }
}