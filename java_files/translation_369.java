import java.util.*;

public class Translation369 {
    public static double kthSmallest(double[] v, int k) {
    double r = Double.NaN;
    k--;
    if (v.length > k && k >= 0) {
        Arrays.sort(v);
        r = v[k];
    }
    return r;
}
}