import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_481 {
    public NGramTokenizerFactory(Map<String,String> args) {
        super(args);
        minGramSize = requireInt(args, "minGramSize");
        maxGramSize = requireInt(args, "maxGramSize");
        preserveOriginal = getBoolean(args, "preserveOriginal", false);
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}