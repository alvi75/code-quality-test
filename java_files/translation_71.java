public MergeShardsResult mergeShards(MergeShardsRequest request) {
    request = beforeClientExecution(request);
    return executeMergeShards(request);
}