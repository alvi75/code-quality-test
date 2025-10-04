import java.util.*;

public class Translation759 {
    public void close() throws IOException {
    if (isOpen && !isClone) {
        try {
            channel.close();
        }
        finally {
            if (!isClone) {
                fis.close();
            }
        }
    }
}
}