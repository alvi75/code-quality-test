using System;
using System.Collections.Generic;

public class Translation344
{
    public override TokenStream Create(TokenStream input){
    return new RussianLightStemFilter(input);
}
}