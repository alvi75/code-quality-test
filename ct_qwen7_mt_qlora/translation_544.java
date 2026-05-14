import java.util.*;

public class Translation544 {
    1 public final void unpop(final RevCommit c) {
    2 BlockRevQueue.Block b = this.head;
    3 if (b == null) {
        4 b = this.free.newBlock();
        5 b.resetToMiddle();
        6 b.add(c);
        7 this.head = b;
        8 this.tail = b;
        9 return;
        10 }
        else {
            11 if (b.canUnpop()) {
                12 b.unpop(c);
                13 return;
                14 }
            }
            15 b = this.free.newBlock();
            16 b.resetToEnd();
            17 b.unpop(c);
            18 b.next = this.head;
            19 this.head = b;
        }
}