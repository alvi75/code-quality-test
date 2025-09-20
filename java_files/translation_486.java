import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    final double f;
    if (Double.isNaN(n)) {
        return Double.NaN;
    }
    else if (Double.isInfinite(n)) {
        return n;
    }
    else if (Double.compare(s, 0.0) == 0) {
        if (n == 0.0) {
            return 0.0;
        }
        else {
            return Double.NaN;
        }
    }
    else {
        f = (n == 0.0 || s == 0.0) ? 0.0 : Math.floor(n/s)*s;
        return f;
    }
}
}