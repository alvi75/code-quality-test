public int get(int i) {
    if (count <= i)throw new ArrayIndexOutOfBoundsException(i);
    return entries[i];
}