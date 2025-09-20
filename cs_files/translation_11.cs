using System;
using System.Collections.Generic;

public class Translation11
{
    public QueryParserTokenManager(ICharStream stream, int lexState): this(stream){
    SwitchTo(lexState);
}
}