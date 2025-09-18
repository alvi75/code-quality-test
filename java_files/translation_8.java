public void init(int address) {
    slice = pool.buffers[address >>> ByteBlockPool.BYTE_BLOCK_SHIFT];
    assert slice != null;
    upto = address & ByteBlockPool.BYTE_BLOCK_MASK;
    offset0 = address & ByteBlockPool.BYTE_BLOCK_MASK;
    assert offset0 < slice.length;
}