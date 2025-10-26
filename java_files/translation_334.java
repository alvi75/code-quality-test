ublic Collection<ParseTree> evaluate(ParseTree t) {
    return Trees.findAllRuleNodes(t, ruleIndex);
}