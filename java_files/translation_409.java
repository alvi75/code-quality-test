public int codePointAt(int index) {
    if (index < 0 || index >= count) {
        throw indexAndLength(index);
    }
    return Character.codePointAt(value, index, count);
}