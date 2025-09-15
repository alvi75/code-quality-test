import java.util.Map;
import java.util.HashMap;
import java.util.*;

public class Translationtranslation_602 {
    public OpenNLPTokenizerFactory(Map<String,String> args) {
        super(args);
        sentenceModelFile = require(args, SENTENCE_MODEL);
        tokenizerModelFile = require(args, TOKENIZER_MODEL);
        if (!args.isEmpty()) {
            throw new IllegalArgumentException("Unknown parameters: " + args);
        }
    }
}