ublic SinglePositionTokenStream(String word) {
    termAtt = addAttribute(CharTermAttribute.class);
    posIncrAtt = addAttribute(PositionIncrementAttribute.class);
    this.word = word;
}