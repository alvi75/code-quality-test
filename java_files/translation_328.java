public StringBuilder insert(int offset, long l) {
    insert0(offset, Long.toString(l));
    return this;
}