import java.util.*;

public class Translation520 {
    public static int numNonnull(Object[] data) {
    int n = 0;
    if (data == null)return n;
    for (Object o : data) {
        if (o != null)n++;
    }
    return n;
}
}