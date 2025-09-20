using System;
using System.Collections.Generic;

public class Translation967
{
    public static double Max(double[] values){
    double max = double.NegInfinity;
    for (int i = 0, iSize = values.Length;
    i < iSize;
    i++){
        max = Math.Max(max, values[i]);
    }
    return max;
}
}