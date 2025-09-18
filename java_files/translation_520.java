public static int numNonNull(Object[] data) {
    int n = 0;
    for (Object o : data) {
        if (o != null) {
            n++;
        }
    }
    return n;
}