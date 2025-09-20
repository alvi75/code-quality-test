using System;
using System.Collections.Generic;

public class Translation752
{
    public virtual IToken LT(int k){
    LazyInit();
    if (k == 0){
        return null;
    }
    if (k < 0){
        return Lb(-k);
    }
    int i = p + k - 1;
    Sync(i);
    if (i >= tokens.Count){
        return null;
    }
    IToken t = tokens[i];
    if (t.Type == TokenConstants.EOF){
        return null;
    }
    return t;
}
}