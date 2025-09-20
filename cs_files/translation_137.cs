using System;
using System.Collections.Generic;

public class Translation137
{
    public LatvianStemFilterFactory(IDictionary<string, string> args): base(args){
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}