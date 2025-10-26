import java.util.*;

public class Translation369 {
    public static double kthSmallest(double[] v, int k) {
    if (v == null || v.length <= k) return Double.NaN;
    Arrays.sort(v);
    return v[k];
}
}