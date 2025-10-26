import java.util.*;

public class Translation728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
    super(args);
    nameType = NameType.valueOf(get(args,"nameType","generic").toUpperCase());
    ruleType = RuleType.valueOf(get(args,"ruleType","approx").toUpperCase());
    concat = getBoolean(args,"concat",true);
    engine = new PhoneticEngine(nameType,ruleType,concat);
    LanguageSet langs = getSet(args,"languageSet");
    languageSet = (langs==null||langs.size()==0)?null:LanguageSet.from(langs);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: "+args);
    }
}
}