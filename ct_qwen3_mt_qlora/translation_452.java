import java.util.*;

public class Translation452 {
    public synchronized void reset() throws IOException {
    checkNotClosed();
    if (mark < 0) {
        throw new IOException("Invalid mark");
    }
    pos = mark;
}
}