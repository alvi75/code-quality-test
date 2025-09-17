import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
        for (int i = 0;
        i < usableBitSetSizes.length;
        i++) {
            int candidate = usableBitSetSizes[i];
            if (candidate <= maxNumberOfValuesExpected && candidate >= Math.toIntExact((long)desiredSaturation * BLS_MAX_SINGLE_BLOCK)) {
                return candidate;
            }
        }
        return -1;
    }
}