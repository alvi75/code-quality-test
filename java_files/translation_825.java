public BlockList() {
    directory = BlockList.<T> newDirectory(256);
    directory[0] = BlockList.<T> newBlock();
    tailBlock = directory[0];
}