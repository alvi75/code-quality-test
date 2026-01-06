import java.util.*;

public class Translation728 {
    public PhoneticFilterFactory(Map<String,String> args) {
    super(args);
    String nameType = get(args, "nameType", PhoneticFilter.NameType.GENERIC.name());
    String ruleType = get(args, "ruleType", PhoneticFilter.RuleType.APPROX.name());
    boolean concat = getBoolean(args, "concat", true);
    this.engine = new PhoneticEngine(PHONETIC_DICTIONARY.get(nameType), PHONETIC_DICTIONARY.get(ruleType), concat);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}