import java.util.*;

public class Translation452 {
    ublic void reset() throws IOException {
    synchronized (lock) {
        checkNotClosed();
        if (mark == -1) {
            throw new IOException("Invalid mark");
        }
        pos = mark;
    }
}
}