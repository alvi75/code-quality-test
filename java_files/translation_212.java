public static double ave dev(double[] v) {
    double r = 0;
    double m = 0;
    double s = 0;
    for (double d : v) {
        s += d;
    }
    m = s / v.length;
    for (double d : v) {
        s += Math.abs(d - m);
    }
    r = s / v.length;
    return r;
}