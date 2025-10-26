import java.util.*;

public class Translation788 {
    public DeleteTableResult deleteTable(String tableName) {
    DeleteTableRequest request = new DeleteTableRequest();
    request.setTableName(tableName);
    return deleteTable(request);
}
}