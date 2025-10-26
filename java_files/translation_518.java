ublic static void strcpy(char[] dst, int di, char[] src, int si) {
    while (src[si] != 0) {
        dst[di++] = src[si++];
    }
    dst[di] = (char)0;
}