import java.util.*;

public class Translation523 {
    1public void flush() throws IOException {
    synchronized (lock) {
        if (!closed && !bufferedOutStreamClosed) {
            outStream.flush();
        }
    }
}
}