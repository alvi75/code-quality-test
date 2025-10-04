import java.util.*;

public class Translation544 {
    public void unpop(RevCommit c) {
    BlockRevQueue.Block b = head;
    if (b == null) {
        b = free.newBlock();
        b.resetToHead();
        b.add(c);
        head = b;
        tail = b;
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
}