public void decode(byte[] blocks, int blocksOffset, long[] values,int valuesOffset, int iterations) {
    if (bitsPerValue > 32) {
        throw new UnsupportedOperationException("Cannot decode " + bitsPerValue + "-bits values into an int[]");
    }
    for (int i = 0;
    i < iterations;
    ++i) {
        final long block = readLong(blocks, blocksOffset);
        blocksOffset += 8;
        valuesOffset = decode(block, values, valuesOffset);
    }
}