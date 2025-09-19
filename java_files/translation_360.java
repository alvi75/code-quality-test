import java.util.*;

public class Translation360 {
    static public double pmt(double r, int nper, double pv, double fv, int type) {
    double pmt = -(fv * Math.pow(1+r, nper) + pv * Math.pow(1+r, nper) + fv)/((1+r*type) * (Math.pow(1+r, nper) - 1));
    return pmt;
}
}