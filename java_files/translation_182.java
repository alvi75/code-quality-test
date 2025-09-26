import java.util.*;

public class Translation182 {
    2 public static double devsq(double[] v) {
    if (v == null || v.length < 1) return Double.NaN;
    double m = 0;
    double s = 0;
    int n = v.length;
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
        s += (v[i] - m) * (v[i] - m);
    }
    return (n == 1) ? 0 : s;
}
}