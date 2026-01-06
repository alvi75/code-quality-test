import java.util.*;

public class Translation545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args) {
    super(args);
    minGramSize = getInt(args, "minGramSize", EdgeNGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInt(args, "maxGramSize", EdgeNGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    side = get(args, "side", EdgeNGramTokenFilter.Side.FRONT.toString());
}
}