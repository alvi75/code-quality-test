import java.util.*;

public class Translation602 {
    public OpenNLPTokenizerFactory(Map<String,String> args) {
    super(args);
    sentenceModelFile = require(args, "sentence_model");
    tokenizerModelFile = require(args, "tokenizer_model");
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}
}