using System;
using System.Collections.Generic;

public class Translation602
{
    public OpenNLPTokenizerFactory(IDictionary<string, string> args): base(args){
    sentenceModelFile = Require(args, SENTENCE_MODEL);
    tokenizerModelFile = Require(args, TOKENIZER_MODEL);
    if (args.Count > 0){
        throw new ArgumentException("Unknown parameters: " + args);
    }
}
}