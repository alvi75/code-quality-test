using System;
using System.Collections.Generic;

public class Translation165
{
    public override TokenStream Create(TokenStream input){
    return new PortugueseStemFilter(input);
}
}