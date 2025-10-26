ublic int[] grow() {
    assert bytesStart != null;
    return bytesStart = ArrayUtil.grow(bytesStart, bytesStart.length + 1);
}