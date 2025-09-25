import java.util.*;

public class Translation452 {
    public synchronized void reset() throws IOException {
    if (mark == -1) {
        throw new IOException("Mark has been invalidated.");
    }
    pos = mark;
}
}