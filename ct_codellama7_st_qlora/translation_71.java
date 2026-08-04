import java.util.*;

public class Translation71 {
    public MergeShardsResult mergeShards(MergeShardsRequest request) {
    request = beforeClientExecution(request);
    return executeMergeShards(request);
}
}