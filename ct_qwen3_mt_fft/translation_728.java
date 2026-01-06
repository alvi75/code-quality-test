import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    final String nameType = get(args, "nameType", NameType.GENERIC.toString());
    final String ruleType = get(args, "ruleType", RuleType.APPROX.toString());
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(NameType.valueOf(nameType), RuleType.valueOf(ruleType), concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (null == langs || (1 == langs.size() && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!(args.isEmpty())) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}