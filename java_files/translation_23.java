import java.util.*;

public class Translation23 {
    @Override public void remove() {
    if (last == null) throw new IllegalStateException("remove() not supported");
    last = last.prev;
    last.next = null;
}
}