ublic static int parseHexInt4(byte digit) {
    int r = digits16[digit];
    if (r < 0) {
        throw new IndexOutOfBoundsException();
    }
    return r;
}