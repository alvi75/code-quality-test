import java.util.Set;
import java.util.HashSet;
import java.util.*;

public class Translationtranslation_202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
        for (int i = 0;
        i < usableBitSetSizes.length;
        i++) {
            int setSize = usableBitSetSizes[i];
            float saturation = (float) setSize / maxNumberOfValuesExpected;
            if (saturation >= desiredSaturation) {
                return setSize;
            }
        }
        return -1;
    }
}