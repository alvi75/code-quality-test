import java.util.*;

public class Translation360 {
    static public double pmt(double r, int nper, double pv, double fv, int type) {
    return -(rv(r, nper) + fv) / (1+r*type);
}
}