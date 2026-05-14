import java.util.*;

public class Translation182 {
    ublic static double devsq(double[] v) {
    if (v == null || v.length < 1) {
        return Double.NaN;
    }
    double m = 0;
    double s = 0;
    final int n = v.length;
    m = ArraysUtils.safeMean(v);
    for (int i = 0;
    i < n;
    i++) {
        s += (v[i] - m) * (v[i] - m);
    }
    return (n == 1)? 0 : s;
}
}