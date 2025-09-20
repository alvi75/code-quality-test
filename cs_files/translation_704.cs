using System;
using System.Collections.Generic;

public class Translation704
{
    public override TextReader Create(TextReader input){
    return new PersianCharFilter(input);
}
}