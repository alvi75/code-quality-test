using System;
using System.Collections.Generic;

public class Translation545
{
    public EdgeNGramTokenizerFactory(IDictionary<string, string> args): base(args){
    minGramSize = GetInt32(args, "minGramSize", EdgeNGramTokenFilter.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = GetInt32(args, "maxGramSize", EdgeNGramTokenFilter.DEFAULT_MAX_GRAM_SIZE);
    side = Get(args, "side", EdgeNGramTokenFilter.Side.FRONT.ToString());
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}