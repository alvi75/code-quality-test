ublic EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInteger(args, "minGramSize", EdgeNGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInteger(args, "maxGramSize", EdgeNGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    side = getSide(args, EdgeNGramTokenFilter.Side.FRONT.toString());
}