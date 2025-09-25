import java.util.*;

public class Translation545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = requireInt(args, "minGramSize");
    maxGramSize = requireInt(args, "maxGramSize");
    preserveOriginal = getBoolean(args, "preserveOriginal", EdgeNGramTokenizer.DEFAULT_PRESERVE_ORIGINAL);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}