public String toString() {
    if (getChildren() == null || getChildren().size() == 0)return "<boolean operation='or'/>";
    StringBuilder sb = new StringBuilder();
    sb.append("<boolean operation='or'>");
    for (QueryNode child : getChildren()) {
        sb.append("\n");
        sb.append(child.toString());
    }
    sb.append("\n</boolean>");
    return sb.toString();
}