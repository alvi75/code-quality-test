import java.util.*;

public class Translation452 {
    public synchronized void reset() throws IOException {
    checkNotClosed();
    if (mark == -1) {
        throw new IllegalStateException("Invalid mark");
    }
    pos = mark;
}
}