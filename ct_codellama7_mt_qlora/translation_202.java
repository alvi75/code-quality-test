import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (int t : _usableBitSetSizes) {
        int numSetBitsAtDesiredSaturation = (int) (t * desiredSaturation);
        int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {
            return t;
        }
    }
}
}