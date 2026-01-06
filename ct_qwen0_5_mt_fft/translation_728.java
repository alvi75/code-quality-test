import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = getEnum(args, "nameType", NameType.GENERIC, false);
    ruleType = getEnum(args, "ruleType", RuleType.APPROX, true);
    concat = getBoolean(args, "concat", true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    setLanguageSet(getSet(args, "languageSet"));
}
}