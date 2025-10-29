import java.util.*;

public class Translation486 {
    public static double floor(double n, double s) {
    double f;
    if ((n < 0 && s > 0) || (n > 0 && s < 0) || (s == 0 && n != 0)) {
        f = Double.NaN;
    }
    else {
        f = (n == 0 || s > 0) ? 0 : Math.floor(n / s) * s;
    }
    return f;
}
}