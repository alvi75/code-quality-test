using System;
using System.Collections.Generic;

public class Translation360
{
    static public double PMT(double r, int nper, double pv, double fv, int type){
    double pmt = -(pv * Math.Pow(1 + r, nper) + fv * (1 + r * type) * (Math.Pow(1 + r, nper) - 1));
    return pmt;
}
}