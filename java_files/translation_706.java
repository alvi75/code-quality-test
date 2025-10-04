import java.util.*;

public class Translation706 {
    public String toString() {
    StringBuilder sb = new StringBuilder("[");
    for (int i = 0;
    i < size;
    i++) {
        if (i > 0) {
            sb.append(", ");
        }
        sb.append(get(i));
    }
    sb.append(']');
    return sb.toString();
}
Create a class in the target language that corresponds to the given Java class. Preserve semantics, be idiomatic in the target language, and output only the translated code—no explanations.
}