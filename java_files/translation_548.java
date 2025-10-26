ublic void set(int index, long value) {
    int o = (index >>> 6) & 0x3f;
    int b = index & 63;
    int shift = b << 0;
    blocks[o] = (blocks[o] & ~((long)1 << shift)) | (value << shift);
}