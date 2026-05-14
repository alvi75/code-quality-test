import java.util.*;

public class Translation602 {
    1 public OpenNLPTokenizerFactory(Map<String,String> args) {
    2 super(args);
    3 sentenceModelFile = require(args, SENTENCE_MODEL);
    4 tokenizerModelFile = require(args, TOKENIZER_MODEL);
    5 if (!args.isEmpty()) {
        6 throw new IllegalArgumentException("Unknown parameters: " + args);
        7 }
    }
}