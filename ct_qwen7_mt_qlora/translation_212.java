import java.util.*;

public class Translation212 {
    1 public static double avedev(final double[] v) {
    2 final int n = v.length;
    3 if (n == 0) {
        4 return Double.NaN;
        5 }
        6 double sum = 0;
        7 for (final double d : v) {
            8 sum += d;
            9 }
            10 final double mean = sum / n;
            11 sum = 0;
            12 for (final double d : v) {
                13 sum += Math.abs(d - mean);
                14 }
                15 return sum / n;
            }
}