import java.util.*;

public class Translation481 {
    public NGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInt(args, "minGramSize", NGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInt(args, "maxGramSize", NGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    preserveOriginalText = getBoolean(args, "preserveOriginalText", NGramTokenizer.DEFAULT_PRESERVE_ORIGINAL_TEXT);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}