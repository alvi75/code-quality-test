public static int trimTrailingWhitespace(byte[] raw, int start, int end) {
    int ptr = end - 1;
    while (start < ptr && isWhitespace(raw[ptr]))ptr--;
    return ptr + 1;
}