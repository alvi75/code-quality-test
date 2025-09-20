using System;
using System.Collections.Generic;

public class Translation102
{
    public override TokenStream Create(TokenStream input){
    return new HyphenatedWordsFilter(input);
}
}