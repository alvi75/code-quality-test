import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (Integer t : usableBitSetSizes.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())) {
        final long numSetBitsAtDesiredSaturation = Math.round(t * desiredSaturation);
        if (getEstimatedNumberUniqueValuesAllowingForCollisions(t, numSetBitsAtDesiredSaturation) > maxNumberOfValuesExpected)return t;
    }
    return -1;
}
}