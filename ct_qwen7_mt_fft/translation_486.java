import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    if (Double.isNaN(s) || Double.isInfinite(s)) {
        return Double.NaN;
    }
    else if (s == 0) {
        return 0;
    }
    else if (n == 0 || s == 0) {
        return 0;
    }
    else {
        return (n/s)*Math.floor(n/s);
    }
}
}