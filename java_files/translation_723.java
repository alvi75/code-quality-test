import java.util.*;

public class Translation723 {
    public synchronized void incrementProgressBy(int diff) {
    if (diff < 0) {
        throw new IllegalArgumentException("Cannot increment by negative value " + diff);
    }
}
}