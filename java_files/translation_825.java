ublic BlockList() {
    directory = new BlockList<>(256);
    directory[0] = new Block<>();
    tailBlock = directory[0];
}