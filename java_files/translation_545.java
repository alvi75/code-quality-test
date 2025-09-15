import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args) {
        super(args);
        minGramSize = requireInt(args, "minGramSize");
        maxGramSize = requireInt(args, "maxGramSize");
        side = get(args, "side", EdgeNGramTokenFilter.SIDE.FRONT.toString());
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}