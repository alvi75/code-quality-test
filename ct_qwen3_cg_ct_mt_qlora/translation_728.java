import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(get(args, "nameType", NameType.GENERIC.toString()));
    ruleType = RuleType.valueOf(get(args, "ruleType", RuleType.APPROX.toString()));
    concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (langs == null || (langs.size() == 1 && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}