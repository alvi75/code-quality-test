import java.util.*;

public class Translation728 {
    public PhoneticFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(get(args, "nameType", NameType.GENERIC.name()));
    ruleType = RuleType.valueOf(get(args, "ruleType", RuleType.APPROX.name()));
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Set< String > langs = getSet(args, "languageSet");
    languageSet = (null == langs || (1 == langs.size() && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}