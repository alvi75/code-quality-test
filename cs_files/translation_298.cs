using System;
using System.Collections.Generic;

public class Translation298
{
    public static float[] Grow(float[] array, int minSize){
    Debug.Assert(minSize >= 0, "size must be positive (got " + minSize + "): likely integer overflow?");
    if (array.Length < minSize){
        float[] newArray = new float[Oversize(minSize, RamUsageEstimator.NUM_BYTES_SINGLE)];
        Array.Copy(array, 0, newArray, 0, array.Length);
        return newArray;
    }
    else{
        return array;
    }
}
}