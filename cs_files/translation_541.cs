using System;
using System.Collections.Generic;

public class Translation541
{
    public override BytesRef Next(){
    termUpto++;
    if (termUpto >= info.terms.Count){
        return null;
    }
    else{
        info.terms.Get(info.sortedTerms[termUpto], br);
        return br;
    }
}
}