import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    if ((n < 0 && s > 0) || (n > 0 && s < 0) || (s == 0 && n != 0)) {
        return Double.NaN;
    }
    else {
        final double f;
        if (n == 0 || s == 0) {
            f = 0;
        }
        else {
            f = Math.floor(n / s) * s;
        }
        return f;
    }
}
}