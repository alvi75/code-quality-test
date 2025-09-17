import java.util.*;

public class Translationtranslation_360 {
    static public double pmt(double r, int nper, double pv, double fv, int type) {
        double pmt = -(r * (pv * Math.pow(1+r, nper) + fv)) /((1+r*type) * (Math.pow(1+r, nper) - 1));
        return pmt;
    }
}