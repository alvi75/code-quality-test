import java.util.*;

public class Translation602 {
    ublic OpenNLPTokenizerFactory(Map<String,String> args) {
    super(args);
    sentenceModelFile = Require(args, SENTENCE_MODEL);
    tokenizerModelFile = Require(args, TOKENIZER_MODEL);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}