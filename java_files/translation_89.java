public QueryNode getChild() {
    return getChildren().size() == 1 ? getChildren().get(0) : null;
}