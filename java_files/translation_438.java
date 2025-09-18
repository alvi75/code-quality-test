public long ramBytesUsed() {
    long size = BASE_RAM_BYTES_USED + RamUsageEstimator.shallowSizeOf(terms);
    if (terms.length > 0) {
        size += (terms.length - 1) * terms[0].ramBytesUsed();
    }
    return size;
}