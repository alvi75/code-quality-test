ublic void unpop(RevCommit c) {
    BlockRevQueue.Block b = head;
    if (b == null) {
        b = free.newBlock();
        b.resetToMiddle();
        b.add(c);
        head = b;
        return;
    }
    else if (b.canUnpop()) {
        b.unpop(c);
        return;
    }
    b = free.newBlock();
    b.resetToEnd();
    b.unpop(c);
    b.next = head;
    head = b;
}