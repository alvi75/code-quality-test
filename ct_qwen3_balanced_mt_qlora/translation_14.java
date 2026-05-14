import java.util.*;

public class Translation14 {
    ublic synchronized boolean ready() throws IOException {
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