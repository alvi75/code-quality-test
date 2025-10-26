ublic V get(char[] text) {
    if (text == null) {
        throw new NullPointerException();
    }
    return default(V);
}