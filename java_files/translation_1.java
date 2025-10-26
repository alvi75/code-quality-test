ublic void addAll(BlockList<T> src) {
    if (src.size == 0) {
        return;
    }
    int srcDirIdx = 0;
    for (int i = src.headDirIdx;
    i < src.tailDirIdx;
    ++i) {
        addAll(src.directory[i], 0, BLOCK_SIZE);
    }
    if (src.tailBlkIdx != 0) {
        addAll(src.tailBlock, 0, src.tailBlkIdx);
    }
}