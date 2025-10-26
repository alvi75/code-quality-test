ublic static double averageDeviation(double[] v) {
    double r = 0;
    double m = 0;
    double s = 0;
    for (int i = 0, iSize = v.length;
    i < iSize;
    i++) {
        s += v[i];
    }
    m = s / v.length;
    s = 0;
    for (int i = 0, iSize = v.length;
    i < iSize;
    i++) {
        s += Math.abs(v[i] - m);
    }
    r = s / v.length;
    return r;
}