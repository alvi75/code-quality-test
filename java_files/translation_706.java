import java.util.*;

public class Translationtranslation_706 {
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0;
        i < fields.length;
        i++) {
            if (i > 0)sb.append(", ");
            sb.append(fields[i]);
        }
        sb.append("]");
        return sb.toString();
    }
}