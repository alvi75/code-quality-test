using System;
using System.Collections.Generic;

public class Translation372
{
    public virtual int sumTokenSizes(int fromIx, int ToIx){
    int result = 0;
    for (int i = fromIx;
    i < ToIx;
    i++){
        result += _ptgs[i].Size;
    }
    return result;
}
}