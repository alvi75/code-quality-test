import java.util.*;

public class Translation14 {
    1 public boolean ready() throws IOException {
    synchronized (lock) {
        if (in == null) {
            throw new IOException("Stream closed");
        }
        return bytes.remaining() > 0 || in.available() > 0;
    }
}
}