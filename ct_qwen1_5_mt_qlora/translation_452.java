import java.util.*;

public class Translation452 {
    public synchronized void reset() {
    synchronized (lock) {
        checkNotClosed();
        if (mark == -1) {
            throw new IOException("Invalid mark");
        }
        pos = mark;
    }
}
}