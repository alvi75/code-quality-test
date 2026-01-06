import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (int i : _usableBitSetSizes) {
        final int numSetBitsAtDesiredSaturation = (int) (i * desiredSaturation);
        final double estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(i, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {
            return i;
        }
    }
    return -1;
}
}