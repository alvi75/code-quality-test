ublic void setQuery(String query) {
    this.query = query;
    this.message = new Message(QueryParserMessages.INVALID_SYNTAX_CANNOT_PARSE, query, "");
}