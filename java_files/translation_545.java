import java.util.*;

public class Translation545 {
    public EdgeNGramTokenizerFactory(Map<String,String> args): base(args){
    minGramSize = getInt32(args, "minGramSize", EdgeNGramTokenizer.DEFAULT_MIN_GRAM_SIZE);
    maxGramSize = getInt32(args, "maxGramSize", EdgeNGramTokenizer.DEFAULT_MAX_GRAM_SIZE);
    side = get(args, "side", EdgeNGramTokenFilter.Side.FRONT.toString());
    if (!args.isEmpty()){
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}