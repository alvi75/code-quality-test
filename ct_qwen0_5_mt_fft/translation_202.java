import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected,float desiredSaturation){
    for (final long t : _usableBitSetSizes.values()) {
        if (t * desiredSaturation < maxNumberOfValuesExpected)return t;
    }
    return -1;
}
}