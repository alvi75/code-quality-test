import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (int t : usableBitSetSizes) {
        final int numSetBitsAtDesiredSaturation = (int) (t * desiredSaturation);
        final long estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {
            return t;
        }
    }
    return -1;
}
}