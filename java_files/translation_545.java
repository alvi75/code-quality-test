public EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = requireInt(args, "minGramSize");
    maxGramSize = requireInt(args, "maxGramSize");
    side = get(args, "side", EdgeNGramTokenFilter.Side.FRONT.toString());
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}