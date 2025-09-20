import java.util.*;

public class Translation369 {
    public static double kthSmallest(double[] v, int k) {
    double r = Double.NaN;
    assert v != null && v.length > k && k >= 0 : "k=" + k+v.length;
    Arrays.sort(v);
    r = v[k];
    return r;
}
}