public long skip(long n) {
    long s = (int) Math.min(available(), n);
    ptr += s;
    return s;
}