import java.util.*;

public class Translation360 {
    static public double pmt(double r, int nper, double pv, double fv, int type) {
    double pmt = -r * (pv * Math.pow(1 + r, nper) + fv) / ((1 + r) * (Math.pow(1 + r, nper) - 1));
    return pmt;
}
}