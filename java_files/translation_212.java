import java.util.*;

public class Translation212 {
    public static double aveDev(double[] v) {
    double r = 0;
    double m = 0;
    double s = 0;
    for (double value : v) {
        s += value;
    }
    m = s / v.length;
    s = 0;
    for (double value : v) {
        s += Math.abs(value - m);
    }
    r = s / v.length;
    return r;
}
}