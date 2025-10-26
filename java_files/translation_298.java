ublic static double[] grow(double[] array, int minSize) {
    assert minSize >= 0 : "size must be positive (got " + minSize + "): likely integer overflow?";
    if (array.length < minSize) {
        double[] newArray = new double[oversize(minSize, RamUsageEstimator.NUM_BYTES_DOUBLE)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        return newArray;
    }
    else {
        return array;
    }
}