using System;
using System.Collections.Generic;

public class Translation115
{
    public virtual IList<IToken> GetHiddenTokensToLeft(int tokenIndex){
    return GetHiddenTokensToLeft(tokenIndex, -1);
}
}