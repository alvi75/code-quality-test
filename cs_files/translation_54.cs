using System;
using System.Collections.Generic;

public class Translation54
{
    public override long Skip(long n){
    int s = (int)Math.Min(available(), n);
    ptr += s;
    return s;
}
}