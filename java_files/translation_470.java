ublic Token recoverInline(Parser recognizer) throws RecognitionException {
    InputMismatchException e = new InputMismatchException(recognizer);
    for (ParserRuleContext context = recognizer.getContext();
    context != null;
    context = ((ParserRuleContext)context.getParent())){
        context.exception = e;
    }
    throw new ParseCancellationException(e);
}