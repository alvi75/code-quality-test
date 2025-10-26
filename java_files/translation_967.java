import java.util.*;

public class Translation967 {
    public static double max(final double... values) {
    final int length = values.length;
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0;
    i < length;
    ++i) {
        max = Math.max(max, values[i]);
    }
    return max;
}
}