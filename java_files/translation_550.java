import java.util.*;

public class Translation550 {
    public String toString() {
    return "spans("+term.toString() +")@"+(doc == -1 ? "START" : (doc == Integer.MAX_VALUE ? "END" : doc + "-" + position));
}
}