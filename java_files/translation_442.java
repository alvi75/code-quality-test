public IndicNormalizationFilterFactory(Map<String,String> args) {
    super(args);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}