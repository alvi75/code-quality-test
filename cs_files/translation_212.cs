using System;
using System.Collections.Generic;

public class Translation212
{
    public static double Avedev(double[] v){
    double r = 0;
    double m = 0;
    double s = 0;
    for (int i = 0, iSize = v.Length;
    i < iSize;
    i++){
        s += v[i];
    }
    m = s / v.Length;
    for (int i = 0, iSize = v.Length;
    i < iSize;
    i++){
        s += Math.Abs(v[i] - m);
    }
    r = s / v.Length;
    return r;
}
}