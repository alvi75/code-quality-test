import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected,float desiredSaturation) {
    for (final Tuple2<Integer, Integer> t : _usableBitSetSizes.entrySet()) {
        final float saturation = t.a / (float)t.b;
        final int numSetBitsAtDesiredSaturation = Math.round(saturation * t.b);
        final int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t.b, numSetBitsAtDesiredSaturation);
        if (estimatedNumUniqueValues <= maxNumberOfValuesExpected) {
            return t.a;
        }
    }
    return -1;
}
}