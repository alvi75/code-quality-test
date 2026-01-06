import java.util.*;

public class Translation523 {
    public synchronized void flush() throws IOException {
    if (closed) {
        throw new IOException("Stream is closed");
    }
    try {
        flushBuffer();
    }
    catch (IOException e) {
        close();
        throw e;
    }
}
}