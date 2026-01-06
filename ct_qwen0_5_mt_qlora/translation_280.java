import java.util.*;

public class Translation280 {
    synchronized public void incrementSecondaryProgressBy(int diff) {
    lock (this) {
        setSecondaryProgress(secondaryProgress + diff);
    }
}
}