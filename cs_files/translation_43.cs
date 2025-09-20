using System;
using System.Collections.Generic;

public class Translation43
{
    public void MultiplyByPowerOfTen(int pow10){
    int x = pow10;
    if (x < 0){
        _significand = _significand.Substring(1);
        x = -1;
    }
    if (x > 20){
        throw new InvalidOperationException("Too many binary digits for pow10=" + x + ". Max is 20");
    }
    _binaryExponent += x;
    _significand = Rounder.Round(_significand, x);
    if (_significand.BitLength() > 64){
        int extra = 64 - _significand.BitLength();
        _significand = _significand.Add(extra);
        x++;
    }
    _significand = _significand.Substring(1);
}
}