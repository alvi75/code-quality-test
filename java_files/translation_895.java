ublic int get(int index, long[] arr, int off, int len) {
    assert len > 0 : "len must be > 0 (got " + len + ")";
    assert index >= 0 && index < valueCount;
    len = Math.min(len, valueCount - index);
    System.arraycopy(value, index * sizeOfValue, arr, off, len);
    return len;
}