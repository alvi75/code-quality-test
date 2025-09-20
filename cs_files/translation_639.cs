using System;
using System.Collections.Generic;

public class Translation639
{
    public virtual long ValueFor(double elapsed){
    double val;
    if (m_type == TYPE_SECOND){
        val = elapsed / 100;
    }
    else{
        val = elapsed;
    }
    if (m_roundingMode == RoundingMode.HALF_UP){
        val++;
    }
    else if (m_roundingMode == RoundingMode.HALF_DOWN){
        val--;
    }
    long wholePart = (long)(val * 10);
    double decimalPart = val - wholePart;
    if (decimalPart != 0.0){
        wholePart++;
    }
    return wholePart;
}
}