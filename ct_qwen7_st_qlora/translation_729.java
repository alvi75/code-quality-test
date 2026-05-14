import java.util.*;

public class Translation729 {
    public static double varP(double[] values) {
    double result = Double.NaN;
    if (values != null && values.length > 1) {
        result = devSq(values) / values.length;
    }
    return result;
}
}