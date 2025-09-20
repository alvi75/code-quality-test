using System;
using System.Collections.Generic;

public class Translation893
{
    public override TokenStream Create(TokenStream input){
    return new EnglishPossessiveFilter(input);
}
}