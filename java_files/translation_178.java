import java.util.*;

public class Translation178 {
    public synchronized void close() throws IOException {
    if (isOpen) {
        isOpen = false;
        try {
            dump();
        }
        finally {
            try {
                channel.truncate(fileLength);
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                channel.close();
            }
            catch (IOException e) {
                throw new RuntimeException(e);
            }
            fos.close();
        }
    }
}
}