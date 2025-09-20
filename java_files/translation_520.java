import java.util.*;

public class Translation520 {
    public static int numNonnull(Object[] data) {
    int n = 0;
    if (data == null)return n;
    for (Object o : data)n += (o != null) ? 1 : 0;
    return n;
}
}