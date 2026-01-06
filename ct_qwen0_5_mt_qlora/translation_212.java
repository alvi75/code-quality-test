import java.util.*;

public class Translation212 {
    public static double averageDeviation(double[] v) {
    double sum = 0;
    for (int i = 0, size = v.length;
    i < size;
    i++) {
        sum += Math.abs(v[i] - mean(v));
    }
    return sum / size;
}
}