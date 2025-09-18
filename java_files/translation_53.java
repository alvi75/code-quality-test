public void setPosition(long position) {
    currentBlockIndex = (int) (position >>> blockBits);
    currentBlock = blocks[currentBlockIndex];
    currentBlockUpto = (int) (position & blockMask);
}