import java.util.*;

public class Translationtranslation_212 {
    public static double aveDev(double[] v) {
        double r = 0;
        double m = 0;
        double s = 0;
        for (double a : v) {
            s += a;
        }
        m = s / v.length;
        s = 0;
        for (double a : v) {
            s += Math.abs(a - m);
        }
        r = s / v.length;
        return r;
    }
}