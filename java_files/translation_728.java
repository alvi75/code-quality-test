import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = Enum.valueOf(NameType.class, get(args, "nameType", NameType.GENERIC.toString()));
    ruleType = Enum.valueOf(RuleType.class, get(args, "ruleType", RuleType.APPROX.toString()));
    concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    languageSet = LanguageSet.from(get(args, "languageSet"));
}
}