ublic override void Decode(byte[] blocks, int blocksOffset, int[] values, int valuesOffset, int iterations){
    for (int j = 0;
    j < iterations;
    ++j){
        var block = blocks[blocksOffset++];
        values[valuesOffset++] = ((block >> 7) & 1) | ((block >> 6) & 1) << 1;
        values[valuesOffset++] = ((block >> 5) & 1) | ((block >> 4) & 1) << 2;
        values[valuesOffset++] = ((block >> 3) & 1) | ((block >> 2) & 1) << 3;
        values[valuesOffset++] = ((block >> 1) & 1) | (block & 1) << 4;
    }
}