import java.util.*;

public class Translation202 {
    public static int getNearestSetSize( int maxNumberOfValuesExpected, float desiredSaturation ){
    for ( int i=0;
    i<_usableBitSetSizes.length;
    i++ ){
        int numBitsInThisUsableSize = _usableBitSetSizes[i];
        int numSetBitsAtDesiredSaturation = (int)(numBitsInThisUsableSize * desiredSaturation);
        float estimatedNumUniqueValues = getEstimatedNumberUniqueValuesAllowingForCollisions(numBitsInThisUsableSize,numSetBitsAtDesiredSaturation);
        if(estimatedNumUniqueValues >= maxNumberOfValuesExpected){
            return _usableBitSetSizes[i];
        }
    }
    return -1;
}
}