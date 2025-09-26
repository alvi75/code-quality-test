import java.util.*;

public class Translation967 {
    1 public static double max(double[] values) {
    double max = Double.NEGATIVE_INFINITY;
    for (double v : values) {
        max = Math.max(max, v);
    }
    return max;
}
}