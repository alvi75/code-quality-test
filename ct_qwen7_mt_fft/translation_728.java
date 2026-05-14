import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    final String nameTypeStr = get(args, "nameType", GenericNameType.class.getSimpleName());
    try {
        nameType = Enum.valueOf(GenericNameType.class, nameTypeStr);
    }
    catch (IllegalArgumentException e) {
        throw new IllegalArgumentException("invalid nameType value '" + nameTypeStr + "'", e);
    }
    final String ruleTypeStr = get(args, "ruleType", ApproximateRuleType.class.getSimpleName());
    try {
        ruleType = Enum.valueOf(ApproximateRuleType.class, ruleTypeStr);
    }
    catch (IllegalArgumentException e) {
        throw new IllegalArgumentException("invalid ruleType value '" + ruleTypeStr + "'", e);
    }
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Set<String> langs = getSet(args, "languageSet");
    languageSet = (langs != null && !langs.isEmpty()) ? LanguageSet.from(langs) : null;
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}