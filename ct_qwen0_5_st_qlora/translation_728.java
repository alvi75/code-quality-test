import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = get(args, "nameType", NAME_TYPE_GENERIC.toString());
    ruleType = get(args, "ruleType", RULE_TYPE_APPROX.toString());
    concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (null == langs || (1 == langs.size() && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}