import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_545 {
    public EdgeNGramTokenFilterFactory(Map<String,String> args) {
        super(args);
        minGramSize = requireInt(args, "minGramSize");
        maxGramSize = requireInt(args, "maxGramSize");
        preserveOriginal = getBoolean(args, "preserveOriginal", EdgeNGramTokenFilter.DEFAULT_PRESERVE_ORIGINAL);
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}