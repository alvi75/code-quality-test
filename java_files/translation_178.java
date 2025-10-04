import java.util.*;

public class Translation178 {
    public void close() throws IOException {
    if (isClosed()) {
        return;
    }
    Throwable thrown = null;
    try {
        flushInternal();
    }
    catch (Throwable e) {
        thrown = e;
    }
    buf = null;
    try {
        out.close();
    }
    catch (Throwable e) {
        if (thrown == null) {
            thrown = e;
        }
    }
    if (thrown != null) {
        SneakyThrow.sneakyThrow(thrown);
    }
}
}