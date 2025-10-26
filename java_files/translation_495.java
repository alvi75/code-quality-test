import java.util.*;

public class Translation495 {
    ublic CreateRelationalDatabaseFromSnapshotResponse CreateRelationalDatabaseFromSnapshot(CreateRelationalDatabaseFromSnapshotRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateRelationalDatabaseFromSnapshotRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateRelationalDatabaseFromSnapshotResponseUnmarshaller.Instance;
    return Invoke<CreateRelationalDatabaseFromSnapshotResponse>(request, options);
}
}