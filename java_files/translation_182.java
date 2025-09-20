import java.util.*;

public class Translation182 {
    public static double sqdev(double[] v) {
    double r = Double.NaN;
    if (v != null && v.length >= 1) {
        double m = 0;
        double s = 0;
        final int n = v.length;
        for (int i = 0;
        i < n;
        i++) {
            s += v[i];
        }
        m = s / n;
        s = 0;
        for (int i = 0;
        i < n;
        i++) {
            s += Math.pow(v[i] - m, 2);
        }
    }
    return r;
}
}