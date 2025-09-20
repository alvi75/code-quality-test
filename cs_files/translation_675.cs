using System;
using System.Collections.Generic;

public class Translation675
{
    public virtual RestoreFromClusterSnapshotResponse RestoreFromClusterSnapshot(RestoreFromClusterSnapshotRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RestoreFromClusterSnapshotRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RestoreFromClusterSnapshotResponseUnmarshaller.Instance;
    return Invoke<RestoreFromClusterSnapshotResponse>(request, options);
}
}