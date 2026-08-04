import java.util.*;

public class Translation23 {
    public void remove() {
    if (this.lastReturned == null) {
        throw new IllegalStateException();
    }
    if (this.expectedModCount == this.list.modCount) {
        this.list.voidLast();
        this.lastReturned = null;
        this.pos--;
    }
    else {
        throw new ConcurrentModificationException();
    }
}
}