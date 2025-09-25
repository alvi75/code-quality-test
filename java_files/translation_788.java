import java.util.*;

public class Translation788 {
    public DeleteTableResult deleteTable(String tableName) {
    final DeleteTableRequest request = new DeleteTableRequest();
    request.setTableName(tableName);
    return deleteTable(request);
}
}