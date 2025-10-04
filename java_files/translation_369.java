import java.util.*;

public class Translation369 {
    public static double kthSmallest(double[] v, int k) {
    double r = Double.NaN;
    int index = k-1;
    if (v!=null && v.length > index && index >= 0) {
        Arrays.sort(v);
        r = v[index];
    }
    return r;
}
}