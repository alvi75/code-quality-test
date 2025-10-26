import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(final int maxNumberOfValuesExpected, final float desiredSaturation) {
    for (final int t : _usableBitSetSizes) {
        final int numSetBitsAtDesiredSaturation = Math.round((float)t * desiredSaturation);
        final int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {
            return t;
        }
    }
}
}