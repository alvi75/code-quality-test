ublic NGramTokenizerFactory(Map<String,String> args) : base(args){
    minGramSize = getInteger(args, "minGramSize", NGramTokenizer.DEFAULT_MIN_NGRAM_SIZE);
    maxGramSize = getInteger(args, "maxGramSize", NGramTokenizer.DEFAULT_MAX_NGRAM_SIZE);
    if (!args.IsEmpty()){
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}