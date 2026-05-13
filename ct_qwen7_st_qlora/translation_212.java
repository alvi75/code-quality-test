import java.util.*;

public class Translation212 {
    public static double avedev(double values[]) {
    double r = 0;
    double m = 0;
    double s = 0;
    for(int i=0, size=values.length;
    i<size;
    i++) {
        s += values[i];
    }
    m = s / values.length;
    s = 0;
    for(int i=0, size=values.length;
    i<size;
    i++) {
        s += Math.abs(values[i]-m);
    }
    r = s/values.length;
    return r;
}
}