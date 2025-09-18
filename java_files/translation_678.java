public static final int prev(byte[] b, int ptr, char chrA) {
    if (ptr == b.length)--ptr;
    while (ptr >= 0) {
        if (b[ptr--] == chrA)return ptr;
    }
    return ptr;
}