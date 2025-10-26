ublic BeiderMorseFilterFactory(Map<string, string> args) : base(args){
    NameType nameType = (NameType)Enum.Parse(typeof(NameType), Get(args, "nameType", NameType.GENERIC.ToString()), true);
    RuleType ruleType = (RuleType)Enum.Parse(typeof(RuleType), Get(args, "ruleType", RuleType.APPROX.ToString()), true);
    bool concat = GetBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    ISet<String> langs = GetSet(args, "languageSet");
    languageSet = (null == langs || (1 == langs.Count && langs.Contains("auto"))) ? null : LanguageSet.From(langs);
    if (!(args.Count == 0)){
        throw new ArgumentException("Unknown parameters: " + args);
    }
}