import java.util.*;

public class Translation728 {
    ublic BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(get(args, "nameType", NameType.GENERIC.toString()).toUpperCase(Locale.ROOT));
    ruleType = RuleType.valueOf(get(args, "ruleType", RuleType.APPROX.toString()).toUpperCase(Locale.ROOT));
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (null == langs || (1 == langs.size() && langs.contains("auto"))) ? null : Collections.unmodifiableSet(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}