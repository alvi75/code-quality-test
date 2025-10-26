ublic virtual RestoreFromClusterSnapshotResponse RestoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RestoreFromClusterSnapshotRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RestoreFromClusterSnapshotResponseUnmarshaller.Instance;
    return Invoke<RestoreFromClusterSnapshotResponse>(request, options);
}