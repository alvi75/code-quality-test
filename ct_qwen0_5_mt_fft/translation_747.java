import java.util.*;

public class Translation747 {
    public static void fill(double[] array, double value) {
    for (double[] x = array;
    x != null;
    x = x[1]) {
        Arrays.fill(x, value);
    }
}
}