ublic int indexOfValue(int value) {
    for (int i = 0;
    i < size();
    i++) {
        if (values[i] == value) return i;
    }
    return -1;
}