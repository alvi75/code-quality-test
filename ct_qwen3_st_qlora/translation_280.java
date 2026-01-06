import java.util.*;

public class Translation280 {
    public void incrementSecondaryProgressBy(int diff) {
    synchronized (this) {
        setSecondaryProgress(mSecondaryProgress + diff);
    }
}
}