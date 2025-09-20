import java.util.*;

public class Translation481 {
    ublic NGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInt(args, "minGramSize", NGramTokenFilter.DEFAULT_MIN_NGRAM_SIZE);
    maxGramSize = getInt(args, "maxGramSize", NGramTokenFilter.DEFAULT_MAX_NGRAM_SIZE);
    preserveOriginal = getBoolean(args, "preserveOriginal", false);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}