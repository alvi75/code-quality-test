ublic java.lang.StringBuilder insert(int offset, long l) {
    insert0(offset, Long.toString(l));
    return this;
}