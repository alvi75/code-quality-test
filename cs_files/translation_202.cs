using System;
using System.Collections.Generic;

public class Translation202
{
    public static int GetNearestSetSize(int maxNumberOfValuesExpected, float desiredSaturation){
    var result = _usableBitSetSizes.FirstOrDefault(t => t <= maxNumberOfValuesExpected && t > 0));
    if (result == null){
        result = _usableBitSetSizes.Max();
    }
    return result;
}
}