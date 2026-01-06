import java.util.*;

public class Translation545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInteger(args, "minGramSize", EdgeNGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInteger(args, "maxGramSize", EdgeNGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    side = get(args, "side", EdgeNGramTokenFilter.Side.FRONT.name());
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}