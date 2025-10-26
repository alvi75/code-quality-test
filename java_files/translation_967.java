ublic static double max(double[] values) {
    double max = Double.NEGATIVE_INFINITY;
    for (int i = 0, iSize = values.length;
    i < iSize;
    i++) {
        max = Math.max(max, values[i]);
    }
    return max;
}