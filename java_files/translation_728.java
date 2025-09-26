import java.util.*;

public class Translation728 {
    2015-03-09 public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    String nameType = get(args, "nameType", NameType.GENERIC.toString());
    String ruleType = get(args, "ruleType", RuleType.APPROX.toString());
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(NameType.valueOf(nameType), RuleType.valueOf(ruleType), concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (langs == null || (langs.size() == 1 && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}