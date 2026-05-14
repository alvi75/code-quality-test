import java.util.*;

public class Translation486 {
    1 public static double floor(double n, double s) {
    2 double f;
    3 if ((n < 0 && s > 0) || (n > 0 && s < 0) || (s == 0 && n != 0)) {
        4 f = Double.NaN;
        5 }
        else {
            6 f = (n == 0 || s == 0) ? 0 : Math.floor(n / s) * s;
            7 }
            8 return f;
        }
}