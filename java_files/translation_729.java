import java.util.*;

public class Translation729 {
    2 public static double varp(double[] v) {
    if (v == null || v.length < 2) return Double.NaN;
    double sum = 0;
    for (int i = 0;
    i < v.length;
    i++) {
        sum += v[i];
    }
    double mean = sum / v.length;
    double sumDevSq = 0;
    for (int i = 0;
    i < v.length;
    i++) {
        sumDevSq += Math.pow(v[i] - mean, 2);
    }
    return sumDevSq / v.length;
}
}