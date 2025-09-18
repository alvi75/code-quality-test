public static boolean[] copyOf(boolean[] original, int newLength) {
    if (newLength < 0) {
        throw new NegativeArraySizeException();
    }
    return copyOfRange(original, 0, newLength);
}