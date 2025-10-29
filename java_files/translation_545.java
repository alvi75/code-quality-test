import java.util.*;

public class Translation545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInteger(args, MIN_GRAM_SIZE, EdgeNGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInteger(args, MAX_GRAM_SIZE, EdgeNGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    side = get(args, SIDE, EdgeNGramTokenFilter.Side.FRONT.toString());
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}