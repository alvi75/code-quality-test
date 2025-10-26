ublic OpenNLPTokenizerFactory(Map<String,String> args) : base(args){
    sentenceModelFile = require(args, SENTENCE_MODEL);
    tokenizerModelFile = require(args, TOKENIZER_MODEL);
    if (!args.isEmpty()) {
        throw new IllegalArgumentException("Unknown parameters: " + args);
    }
}