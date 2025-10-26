ublic DeleteTableResponse deleteTable(String tableName) {
    return deleteTable(new DeleteTableRequest().withTableName(tableName));
}