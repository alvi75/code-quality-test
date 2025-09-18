public int offsetByCodePoints(int index, int codePointOffset) {
    return Character.offsetByCodePoints(value, 0, count, index, codePointOffset);
}