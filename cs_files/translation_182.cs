using System;
using System.Collections.Generic;

public class Translation182
{
    public static double Devsq(double[] v){
    double r = double.NaN;
    if (v != null && v.Length >= 1){
        double m = 0;
        double s = 0;
        int n = v.Length;
        for (int i = 0;
        i < n;
        i++){
            s += v[i];
        }
        m = s / n;
        for (int i = 0;
        i < n;
        i++){
            s += (v[i] - m) * (v[i] - m);
        }
        r = (n == 1) ? 0 : s;
    }
    return r;
}
}