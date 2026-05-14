import java.util.*;

public class Translation729 {
    public static double varp(double[] v) {
    if (v.length <= 1) {
        return Double.NaN;
    }
    return Math.pow(sdev(v),2);
}
}