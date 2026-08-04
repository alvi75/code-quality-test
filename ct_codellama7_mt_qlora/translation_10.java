import java.util.*;

public class Translation10 {
    public ListIngestionsResult listIngestions(ListIngestionsRequest request) {
    request = beforeClientExecution(request);
    return executeListIngestions(request);
}
}