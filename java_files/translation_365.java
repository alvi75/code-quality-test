import java.util.*;

public class Translation365 {
    public String toString() {
    if (outputs == null) {
        return "null";
    }
    StringBuilder b = new StringBuilder();
    b.append("[").append(outputs.toString()).append("]");
    return b.toString();
}
}