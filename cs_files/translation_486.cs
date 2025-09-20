using System;
using System.Collections.Generic;

public class Translation486
{
    public static double floor(double n, double s){
    if (s == 0 && n != 0){
        return double.NaN;
    }
    else{
        return (n == 0 || s == 0) ? 0 : Math.Floor(n / s) * s;
    }
}
}