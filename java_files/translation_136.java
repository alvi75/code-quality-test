public ErrorNode addChild(Token badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addAnyChild(t);
    t.setParent(this);
    return t;
}