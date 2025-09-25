import java.util.*;

public class Translation523 {
    public void flush() throws IOException {
    if (out == null) {
        throw new IllegalStateException("closed");
    }
    try {
        flushLock.lock();
        try {
            checkNotClosed();
            int n = count;
            count = 0;
            if (n > 0) {
                write(buf, 0, n);
            }
        }
        finally {
            flushLock.unlock();
        }
    }
    catch (InterruptedIOException e) {
        Thread.currentThread().interrupt();
    }
    catch (Throwable t) {
        setError(t);
    }
    finally {
        lockAll.flush();
    }
}
}