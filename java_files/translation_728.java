import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
        super(args);
        nameType = NameType.get(args.remove("nameType", GenericNameParser.NAME_TYPE_GENRIC.toString()));
        ruleType = RuleType.get(args.remove("ruleType", GenericNameParser.RULE_TYPE_APPROX.toString()));
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}