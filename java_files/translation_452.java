import java.util.*;

public class Translationtranslation_452 {
    public synchronized void reset() throws IOException {
        checkNotClosed();
        if (mark == -1) {
            throw new IOException("Invalid mark");
        }
        pos = mark;
    }
}