public long ramBytesUsed() {
    return ((termBytesReader!=null)? termBytesReader.ramBytesUsed() : 0);
}