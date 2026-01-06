import java.util.*;

public class Translation360 {
    public static double PMT(double r, int nper, double pv, double fv, int type) {
    final double pmt = -(r * (pv * Math.pow(1 + r, nper) + fv)) / ((1 + r * type) * (Math.pow(1 + r, nper) - 1));
    return pmt;
}
}