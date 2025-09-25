import java.util.*;

public class Translation280 {
    public synchronized void incrementSecondaryProgressBy(int diff) {
    if (mIndeterminate) {
        return;
    }
    if (diff < 0) {
        throw new IllegalArgumentException("Increment must be positive.");
    }
    if (mSecondaryProgress + diff > mMax) {
        mSecondaryProgress = mMax;
    }
    else {
        mSecondaryProgress += diff;
    }
}
}