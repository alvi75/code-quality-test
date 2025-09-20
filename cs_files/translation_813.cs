using System;
using System.Collections.Generic;

public class Translation813
{
    public virtual EnableSnapshotCopyResponse EnableSnapshotCopy(EnableSnapshotCopyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableSnapshotCopyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableSnapshotCopyResponseUnmarshaller.Instance;
    return Invoke<EnableSnapshotCopyResponse>(request, options);
}
}