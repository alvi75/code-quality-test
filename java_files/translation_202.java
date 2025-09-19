import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
    for (int i = 0;
    i < _usableBitSetSizes.length;
    i++) {
        int numSetBitsAtDesiredSaturation = (int) (maxNumberOfValuesExpected * desiredSaturation);
        if (_usableBitSetSizes[i]<=numSetBitsAtDesiredSaturation) {
            return _usableBitSetSizes[i];
        }
    }
}
return -1;
}
}