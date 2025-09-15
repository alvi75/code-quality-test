import java.util.*;

public class Translationtranslation_759 {
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