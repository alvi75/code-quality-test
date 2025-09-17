import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_202 {
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