import java.util.*;

public class Translationtranslation_212 {
    public static double aveDev(double[] v) {
        double r = 0;
        double m = 0;
        double s = 0;
        for (final double val : v) {
            s += val;
        }
        m = s / v.length;
        for (final double val : v) {
            s += Math.abs(val - m);
        }
        r = s / v.length;
        return r;
    }
}