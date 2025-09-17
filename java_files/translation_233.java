public BooleanQuery build(QueryNode queryNode) throws QueryNodeException {
    final AnyQueryNode orNode = (AnyQueryNode) queryNode;
    boolean queryAll = false;
    List<QueryNode> children = orNode.getChildren();
    if (children != null) {
        for (QueryNode child : children) {
            Object obj = child.getTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null) {
                Query query = (Query) obj;
                try {
                    queryAll = queryAll || (query.matchNoDocs() > 0);
                }
                catch (TooManyClausesException tme) {
                    throw new QueryNodeException(new MessageImpl(QueryParserMessages.TOO_MANY_BOOLEAN_CLAUSES, tme.getMessage()));
                }
            }
        }
    }
    BooleanQuery.Builder bq = new BooleanQuery.Builder();
    bq.setMinimumNumberShouldMatch(orNode.getMinMatchingNumber());
    bq.setEnablePositionIncrements(true);
    if (orNode.isSet(BooleanQueryNode.OPTIONAL_OPERATOR)) {
        bq.setOperator(Operator.getNullableValue(orNode.getOptionalOperator()));
    }
    if (orNode.hasChild(BooleanQueryNode.class)) {
        bq.add(new BooleanQuery(), BooleanClause.Occur.SHOULD);
    }
    if (orNode.hasChildren()) {
        TernaryTreeQueryBuilder tbtq = new TernaryTreeQueryBuilder();
        tbtq.build(orNode.getChildren());
        bq.add(tbtq.toQuery(), BooleanClause.Occur.SHOULD);
    }
    return bq.build();
}