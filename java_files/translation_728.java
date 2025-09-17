import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_728 {
    public BeiderMorseFilterFactory(Map<String,String> args) {
        super(args);
        nameType = get(args, "nameType", NameType.GENERIC.toString());
        ruleType = get(args, "ruleType", RuleType.APPROX.toString());
        int weight = getInt(args, "weight", 1);
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}