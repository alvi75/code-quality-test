import java.util.*;

public class Translation14 {
    ublic boolean ready() throws IOException {
    synchronized (lock) {
        if (in == null) {
            throw new IOException("InputStreamReader is closed");
        }
        try {
            return bytes.hasRemaining() || in.available() > 0;
        }
        catch (IOException e) {
            throw new IOException(e);
        }
    }
}
}