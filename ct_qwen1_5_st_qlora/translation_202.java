import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (final int t : _usableBitSetSizes) {
        final int numSetBitsAtDesiredSaturation = (int) (t * desiredSaturation);
        final int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues > maxNumberOfValuesExpected) return t;
    }
    return -1;
}
}