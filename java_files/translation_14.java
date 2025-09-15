import java.util.*;

public class Translationtranslation_14 {
    public boolean ready() throws IOException {
        synchronized (lock) {
            if (in == null) {
                throw new IOException("InputStreamReader is closed");
            }
            try {
                return in.ready();
            }
            catch (IOException e) {
                refill();
                return false;
            }
        }
    }
}