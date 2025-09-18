public long ramBytesUsed() {
    long size = 0;
    for(FieldIndexData entry : fields.values()) {
        size += entry.ramBytesUsed();
    }
    return size;
}