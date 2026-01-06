import java.util.*;

public class Translation248 {
    public static double irr(double[] income) {
    double sum = 0;
    for (int i = 0;
    i < income.Length;
    i++) {
        sum += income[i];
    }
    return Math.pow(1 + 0.1, -sum)/0.1;
}
}