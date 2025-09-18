public void writeByte(byte b) {
    if (upto == blockSize) {
        if (currentBlock != null) {
            addBlock(currentBlock);
        }
        currentBlock = new byte[blockSize];
        upto = 0;
    }
    currentBlock[upto++] = b;
}