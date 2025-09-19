import java.util.*;

public class Translation280 {
    public synchronized void incrementSecondaryProgressBy(int diff) {
    mIndeterminate = false;
    mCurrentDrawable = mIndeterminateDrawable;
    mProgress += diff;
    invalidate();
}
}