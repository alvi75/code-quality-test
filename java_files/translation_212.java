import java.util.*;

public class Translation212 {
    public static double aveDev(double[] v) {
    double r = 0;
    double m = 0;
    double s = 0;
    for (double d : v) {
        s += d;
    }
    m = s / v.length;
    s = 0;
    for (double d : v) {
        s += Math.abs(d - m);
    }
    r = s / v.length;
    return r;
}
}