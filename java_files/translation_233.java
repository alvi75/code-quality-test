public BooleanQuery build(QueryNode queryNode) throws QueryNodeException {
    if (!(queryNode instanceof AndQueryNode)) {
        throw new QueryNodeException(new MessageImpl(QueryParserMessages.LUCENE_QUERY_CONVERSION_ERROR, queryNode.toQueryString(new EscapeQuerySyntaxImpl()), queryNode.getClass().getName()));
    }
    final AndQueryNode andNode = (AndQueryNode) queryNode;
    final BooleanQuery.Builder bQuery = new BooleanQuery.Builder();
    final List<QueryNode> children = andNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    bQuery.add(query, getModifierValue(child));
                }
                catch (TooManyClauses ex) {
                    throw new QueryNodeException(new MessageImpl(QueryParserMessages.TOO_MANY_BOOLEAN_CLAUSES, ex));
                }
            }
        }
    }
    bQuery.setMinimumNumberShouldMatch(andNode.getMinMatchingElements());
    return bQuery.build();
}