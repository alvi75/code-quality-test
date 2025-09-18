public void multiplyByPowerOfTen(int pow10) {
    final int MAX_POW10 = 39;
    final int MIN_POW10 = -37;
    if (pow10 < MIN_POW10) {
        pow10 = MIN_POW10;
    }
    else if (pow10 > MAX_POW10) {
        pow10 = MAX_POW10;
    }
    int x = pow10 / LOG_BASE_10_OF_2;
    int y = pow10 % LOG_BASE_10_OF_2;
    long base = 2L;
    base = base << x;
    int shift = y << x;
    val = shift * base;
}