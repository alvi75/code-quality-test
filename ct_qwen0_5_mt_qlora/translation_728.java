import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(args.get("nameType").toUpperCase(Locale.ENGLISH));
    ruleType = RuleType.valueOf(args.get("ruleType").toUpperCase(Locale.ENGLISH));
    concat = Boolean.parseBoolean(args.get("concat"));
    engine = new PhoneticEngine(nameType, ruleType, concat);
    languageSet = LanguageSet.from(args.get("languageSet"));
}
}