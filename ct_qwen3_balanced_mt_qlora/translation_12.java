import java.util.*;

public class Translation12 {
    ublic GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
    request = beforeClientExecution(request);
    return executeGetShardIterator(request);
}
}