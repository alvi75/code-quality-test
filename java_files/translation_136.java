ublic ErrorNode AddErrorNode(IToken badToken) {
    ErrorNodeImpl t = new ErrorNodeImpl(badToken);
    addChild(t);
    t.setParent(this);
    return t;
}