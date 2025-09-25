import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(float desiredSaturation, int maxNumberOfValuesExpected) {
    for (int i = 0;
    i < _usableBitSetSizes.Count;
    i++) {
        float numSetBitsAtDesiredSaturation = _usableBitSetSizes[i] * desiredSaturation;
        if (numSetBitsAtDesiredSaturation >= maxNumberOfValuesExpected) {
            return _usableBitSetSizes[i];
        }
    }
    return -1;
}
}