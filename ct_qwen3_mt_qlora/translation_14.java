import java.util.*;

public class Translation14 {
    134 public boolean ready() throws IOException {
    synchronized (lock) {
        if (in == null) {
            throw new IOException("InputStreamReader is closed");
        }
        return bytes.remaining() > 0 || in.available() > 0;
    }
}
}