using System;
using System.Collections.Generic;

public class Translation729
{
    public static double VARP(double[] v){
    double r = double.NaN;
    if (v != null && v.Length > 1){
        r = DevSq(v) / v.Length;
    }
    return r;
}
}