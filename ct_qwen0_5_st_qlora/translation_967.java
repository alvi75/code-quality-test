import java.util.*;

public class Translation967 {
    public static double max(double[] values) {
    double max = Double.NEGATIVE_INFINITY;
    for (double value : values) {
        if (value > max) {
            max = value;
        }
    }
    return max;
}
}