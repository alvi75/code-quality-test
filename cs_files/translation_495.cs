using System;
using System.Collections.Generic;

public class Translation495
{
    public virtual CreateRelationalDatabaseFromSnapshotResponse CreateRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateRelationalDatabaseFromSnapshotRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateRelationalDatabaseFromSnapshotResponseUnmarshaller.Instance;
    return Invoke<CreateRelationalDatabaseFromSnapshotResponse>(request, options);
}
}