import java.util.*;

public class Translation12 {
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
    request = beforeClientExecution(request);
    return executeGetShardIterator(request);
}
}