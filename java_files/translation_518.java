public static void strCpy(char[] dst, int di, char[] src, int si) {
    while (src[si] != 0) {
        dst[di++] = src[si++];
    }
    dst[di] = 0;
}