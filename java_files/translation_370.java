ublic void set(int index, long value) {
    int o = (index >>> 5) & 0x7f;
    int b = index & 0x1f;
    int shift = b << 1;
    blocks[o] = (blocks[o] & ~((long)3 << shift)) | (value << shift);
}