import java.util.*;

public class Translation481 {
    public NGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInteger(args, "minGramSize", NGramTokenizer.DEFAULT_MIN_NGRAM_SIZE);
    maxGramSize = getInteger(args, "maxGramSize", NGramTokenizer.DEFAULT_MAX_NGRAM_SIZE);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}