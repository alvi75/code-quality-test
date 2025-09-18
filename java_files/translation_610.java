public RuleTagToken(String ruleName, int bypassTokenType,String label) {
    if (ruleName == null || ruleName.isEmpty()) {
        throw new IllegalArgumentException("ruleName must not be null or empty");
    }
    this.ruleName = ruleName;
    this.bypassTokenType = bypassTokenType;
    this.label = label;
}