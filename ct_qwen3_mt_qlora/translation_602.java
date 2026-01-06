import java.util.*;

public class Translation602 {
    ublic OpenNLPTokenizerFactory(Map<String,String> args) {
    super(args);
    sentenceModelFile = require(args, SENTENCE_MODEL);
    tokenizerModelFile = require(args, TOKENIZER_MODEL);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}