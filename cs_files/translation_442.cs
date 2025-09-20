using System;
using System.Collections.Generic;

public class Translation442
{
    public IndicNormalizationFilterFactory(IDictionary<string, string> args): base(args){
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}