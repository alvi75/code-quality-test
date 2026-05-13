import java.util.*;

public class Translation202 {
    0;
for (final int t : usableBitSetSizes) {
    final int numSetBitsAtDesiredSaturation = (int) (t * desiredSaturation);
    final int estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation);
    if (estimatedNumUniqueValues > maxNumberOfValuesExpected) {
        return t;
    }
}
return -1;
}
}