import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(get(args,"nameType","GENERIC").toUpperCase());
    ruleType = RuleType.valueOf(get(args,"ruleType","APPROX").toUpperCase());
    concat = getBoolean(args,"concat",true);
    engine = new PhoneticEngine(nameType, ruleType, concat);
    languageSet = getLanguageSet(args);
}
}