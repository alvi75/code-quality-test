using System;
using System.Collections.Generic;

public class Translation866
{
    public override AreaEval Offset(int relFirstRowIx, int relLastRowIx,int relFirstColIx, int relLastColIx){
    if (_refEval == null){
        return _areaEval.Offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
    }
    return _refEval.Offset(relFirstRowIx, relLastRowIx, relFirstColIx, relLastColIx);
}
}