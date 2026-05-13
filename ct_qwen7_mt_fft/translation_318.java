import java.util.*;

public class Translation318 {
    public synchronized long skip(final long charCount) throws IOException {
    if (charCount < 0) {
        throw new IllegalArgumentException("charCount < 0: " + charCount);
    }
    final long inSkipped = in.skip(charCount);
    synchronized (lock) {
        pos += inSkipped;
    }
    return inSkipped;
}
}