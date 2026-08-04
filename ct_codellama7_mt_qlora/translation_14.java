import java.util.*;

public class Translation14 {
    public boolean ready() throws IOException {
    synchronized (lock) {
        if (in == null) {
            throw new IOException("InputStreamReader is closed");
        }
        try {
            return bytes.hasRemaining() || in.available() > 0;
        }
        catch (IOException e) {
            return false;
        }
    }
}
}