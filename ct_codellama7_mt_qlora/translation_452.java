import java.util.*;

public class Translation452 {
    public void reset() throws IOException {
    synchronized (lock) {
        checkNotClosed();
        if (_mark == -1) {
            throw new IOException("Invalid mark");
        }
        pos = _mark;
    }
}
}