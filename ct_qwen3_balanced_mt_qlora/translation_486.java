import java.util.*;

public class Translation486 {
    ublic static double floor(double n, double s) {
    if ((n < 0 && s > 0) || (n > 0 && s < 0) || (s == 0 && n != 0)) {
        return Double.NaN;
    }
    else {
        return (n == 0 || s == 0) ? 0 : Math.floor(n / s) * s;
    }
}
}