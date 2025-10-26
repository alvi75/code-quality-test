import java.util.*;

public class Translation369 {
    ublic static double kthSmallest(double[] v, int k) {
    double r = Double.NaN;
    int n = v.length;
    if (k < 0 || k > n) {
        throw new System.ArgumentException("k must be between 0 and " + n);
    }
    Arrays.sort(v);
    r = v[k - 1];
    return r;
}
}