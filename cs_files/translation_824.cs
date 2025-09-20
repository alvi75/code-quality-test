using System;
using System.Collections.Generic;

public class Translation824
{
    public override TokenStream Create(TokenStream @in){
    return new ReverseStringFilter(@in);
}
}