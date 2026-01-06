import java.util.*;

public class Translation723 {
    synchronized public void incrementProgressBy(int diff) {
    lock (this) {
        setProgress(mProgress + diff);
    }
}
}