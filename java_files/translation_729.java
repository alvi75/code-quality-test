import java.util.*;

public class Translation729 {
    public static double varp(double[] v) {
    if (v == null || v.length < 2) {
        return Double.NaN;
    }
    double r = Double.NaN;
    if (v.length > 1) {
        r = devsq(v) / v.length;
    }
    return r;
}
}