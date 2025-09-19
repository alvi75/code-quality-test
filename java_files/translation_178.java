import java.util.*;

public class Translation178 {
    public void close() throws IOException {
    if (isOpen) {
        try {
            flush();
        }
        finally {
            if (!isClone()) {
                fis.close();
            }
        }
    }
}
}