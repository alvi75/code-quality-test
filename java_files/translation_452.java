import java.util.*;

public class Translation452 {
    public synchronized void reset() throws IOException {
    if (_mark == -1) {
        throw new IOException("Invalid mark");
    }
    pos = _mark;
}
}