using System;
using System.Collections.Generic;

public class Translation458
{
    public override TokenStream Create(TokenStream input){
    return new GermanMinimalStemFilter(input);
}
}