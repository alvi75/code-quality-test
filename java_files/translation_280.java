import java.util.*;

public class Translation280 {
    ublic void incrementSecondaryProgressBy(int diff) {
    synchronized(this) {
        setSecondaryProgress(secondaryProgress + diff);
    }
}
}