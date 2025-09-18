public String getErrorHeader(RecognitionException re) {
    int line = re.getOffendingToken().getLine();
    int charPositionInLine = re.getOffendingToken().getCharPositionInLine();
    return "line "+line+" charPositionInLine "+charPositionInLine;
}