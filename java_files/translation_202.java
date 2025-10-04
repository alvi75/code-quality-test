import java.util.*;

public class Translation202 {
    public static int getNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
    int result=usableBitSetSizes[0];
    for (int i = 0;
    i < usableBitSetSizes.length;
    i++) {
        if(usableBitSetSizes[i]<=maxNumberOfValuesExpected && usableBitSetSizes[i]*desiredSaturation>=maxNumberOfValuesExpected){
            result=usableBitSetSizes[i];
        }
    }
    return result;
}
}