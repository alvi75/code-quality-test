import java.util.*;

public class Translation202 {
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