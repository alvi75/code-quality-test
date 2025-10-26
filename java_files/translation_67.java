ublic int get(int i) {
    if (count <= i) {
        throw new IndexOutOfBoundsException();
    }
    return entries[i];
}