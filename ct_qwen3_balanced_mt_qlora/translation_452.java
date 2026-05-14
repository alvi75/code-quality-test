import java.util.*;

public class Translation452 {
    ublic synchronized void reset() throws IOException {
    checkNotClosed();
    if (_mark == -1) {
        throw new IOException("Invalid mark");
    }
    pos = _mark;
}
}