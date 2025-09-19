import java.util.*;

public class Translation759 {
    public final void close() throws IOException {
    if (isOpen && !isClone()) {
        try {
            channel.close();
        }
        finally {
            if (!isClone()) {
                fis.close();
            }
        }
    }
}