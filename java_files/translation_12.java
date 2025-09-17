import java.util.*;

public class Translationtranslation_12 {
    public GetShardIteratorResult getShardIterator(GetShardIteratorRequest request) {
        request = beforeClientExecution(request);
        return executeGetShardIteratorShardCount(request);
    }
}