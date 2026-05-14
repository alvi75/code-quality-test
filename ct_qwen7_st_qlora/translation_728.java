import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    String nameTypeName = get(args, "nameType", NameType.GENERIC.toString());
    nameType = Enum.valueOf(NameType.class, nameTypeName.toUpperCase(Locale.ROOT));
    String ruleTypeName = get(args, "ruleType", RuleType.APPROX.toString());
    ruleType = Enum.valueOf(RuleType.class, ruleTypeName.toUpperCase(Locale.ROOT));
    boolean concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    Collection<String> langs = getSet(args, "languageSet");
    languageSet = null == langs || (1 == langs.size() && langs.contains("auto")) ? null : LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}