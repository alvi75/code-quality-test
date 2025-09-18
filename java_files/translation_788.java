public DeleteTableResult deleteTable(String tableName) {
    return deleteTable(new DeleteTableRequest().withTableName(tableName));
}