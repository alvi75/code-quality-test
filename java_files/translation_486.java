import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    if (n == Double.POSITIVE_INFINITY || n == Double.NEGATIVE_INFINITY) {
        return Double.POSITIVE_INFINITY;
    }
    else if (n == Double.NaN) {
        return Double.NaN;
    }
    else if (s == Double.POSITIVE_INFINITY || s == Double.NEGATIVE_INFINITY) {
        return s;
    }
    else {
        return Math.floor(n / s) * s;
    }
}
}