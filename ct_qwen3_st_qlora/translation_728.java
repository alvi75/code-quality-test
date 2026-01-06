import java.util.*;

public class Translation728 {
    ublic BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    String nameTypeStr = get(args, "nameType", "GENERIC");
    this.nameType = NameType.valueOf(nameTypeStr);
    String ruleTypeStr = get(args, "ruleType", "APPROX");
    this.ruleType = RuleType.valueOf(ruleTypeStr);
    boolean concat = getBoolean(args, "concat", true);
    this.engine = new PhoneticEngine(nameType, ruleType, concat);
    Set<String> langs = getSet(args, "languageSet");
    this.languageSet = (langs == null || (langs.size() == 1 && langs.contains("auto"))) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}