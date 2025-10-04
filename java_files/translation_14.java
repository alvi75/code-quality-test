import java.util.*;

public class Translation14 {
    public boolean ready() throws IOException {
    synchronized (lock) {
        if (in == null) {
            throw new IOException("InputStreamReader is closed");
        }
        return (bytes.length - pos > 0 || in.available() > 0);
    }
}