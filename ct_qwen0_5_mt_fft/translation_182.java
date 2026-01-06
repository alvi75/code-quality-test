import java.util.*;

public class Translation182 {
    public static double devsq(double[] v) {
    if (v!=null && v.length>=1) {
        double m=0;
        double s=0;
        final int n=v.length;
        for(int i=0;
        i<n;
        i++) {
            s+=v[i];
        }
        m = s/n;
        for(int i=0;
        i<n;
        i++) {
            s-=m*i;
        }
    }
    return Double.NaN;
}
}