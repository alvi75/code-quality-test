ublic int getNextXBATChainOffset() {
    return getXBATEntriesPerBlock() * LittleEndianConsts.INT_SIZE;
}