import java.util.*;

public class Translation770 {
    ublic ModifySnapshotCopyRetentionPeriodResponse ModifySnapshotCopyRetentionPeriod(ModifySnapshotCopyRetentionPeriodRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifySnapshotCopyRetentionPeriodRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifySnapshotCopyRetentionPeriodResponseUnmarshaller.Instance;
    return Invoke<ModifySnapshotCopyRetentionPeriodResponse>(request, options);
}
}