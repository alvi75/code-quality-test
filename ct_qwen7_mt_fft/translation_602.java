import java.util.*;

public class Translation602 {
    public OpenNLPTokenizerFactory(Map<String,String> args) {
    super(args);
    sentenceModelFile = get(args, SENTENCE_MODEL);
    tokenizerModelFile = get(args, TOKENIZER_MODEL);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}