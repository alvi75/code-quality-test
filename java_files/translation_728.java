public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.get(args.remove("nameType", GenericText.NAME_TYPE_GENRIC.toString()));
    ruleType = RuleType.get(args.remove("ruleType", GenericText.RULE_TYPE_APPROX.toString()));
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}