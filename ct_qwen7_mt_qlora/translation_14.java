import java.util.*;

public class Translation14 {
    1 public boolean ready() throws IOException {
    2 synchronized (lock) {
        3 if (in == null)4 throw new IOException("InputStreamReader is closed");
        5 try {
            6 return bytes . hasRemaining() || in . available() > 0;
            7 }
            catch (IOException e) {
                8 return false;
                9 }
                10 }
            }
}