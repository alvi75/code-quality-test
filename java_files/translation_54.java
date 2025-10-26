ublic long skip(long n) {
    int s = (int)Math.min(Available(), Math.max(0, n));
    ptr += s;
    return s;
}