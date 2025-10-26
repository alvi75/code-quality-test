ublic static int getEncodedSize(Array values) {
    int result = values.length * 1;
    for (int i = 0;
    i < values.length;
    i++) {
        result += getEncodedSize(values.getValue(i));
    }
    return result;
}