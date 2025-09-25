import java.util.*;

public class Translation729 {
    public static double varp(double[] v) {
    double r = Double.NaN;
    if (v != null && v.length > 1) {
        r = devsquared(v) / v.length;
    }
    return r;
}
}