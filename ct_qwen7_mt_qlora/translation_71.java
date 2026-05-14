import java.util.*;

public class Translation71 {
    1 public MergeShardsResult mergeShards(MergeShardsRequest request) {
    request = beforeClientExecution(request);
    return executeMergeShards(request);
}
}