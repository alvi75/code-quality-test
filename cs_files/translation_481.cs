using System;
using System.Collections.Generic;

public class Translation481
{
    public NGramTokenizerFactory(IDictionary<string, string> args): base(args){
    minGramSize = GetInt32(args, "minGramSize", NGramTokenizer.DEFAULT_MIN_NGRAM_SIZE);
    maxGramSize = GetInt32(args, "maxGramSize", NGramTokenizer.DEFAULT_MAX_NGRAM_SIZE);
    if (args.Count > 0){
        throw new System.ArgumentException("Unknown parameters: " + args);
    }
}
}