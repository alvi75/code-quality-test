ublic java.lang.StringBuilder insert(int offset, int i) {
    insert0(offset, Integer.toString(i));
    return this;
}