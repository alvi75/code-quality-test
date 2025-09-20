using System;
using System.Collections.Generic;

public class Translation770
{
    public virtual ModifySnapshotCopyRetentionPeriodResponse ModifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifySnapshotCopyRetentionPeriodRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifySnapshotCopyRetentionPeriodResponseUnmarshaller.Instance;
    return Invoke<ModifySnapshotCopyRetentionPeriodResponse>(request, options);
}
}