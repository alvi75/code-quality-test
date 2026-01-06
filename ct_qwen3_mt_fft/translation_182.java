import java.util.*;

public class Translation182 {
    public static double devsq(double[] v) {
    if (v == null || v.length < 2) {
        return Double.NaN;
    }
    else if (v.length == 2) {
        return Math.pow(v[1] - v[0], 2);
    }
    else {
        final int n = v.length;
        final double m = mean(v);
        double s = 0;
        for (int i = 0;
        i < n;
        i++) {
            s += (v[i] - m) * (v[i] - m);
        }
        return s / (n - 1);
    }
}
}