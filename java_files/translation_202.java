import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation) {
    for (int t : _usableBitSetSizes) {
        if (t * desiredSaturation < maxNumberOfValuesExpected) {
            return t;
        }
    }
    return -1;
}
}