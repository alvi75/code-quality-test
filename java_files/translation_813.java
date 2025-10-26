import java.util.*;

public class Translation813 {
    ublic EnableSnapshotCopyResponse EnableSnapshotCopy(EnableSnapshotCopyRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = EnableSnapshotCopyRequestMarshaller.Instance;
    options.ResponseUnmarshaller = EnableSnapshotCopyResponseUnmarshaller.Instance;
    return Invoke<EnableSnapshotCopyResponse>(request, options);
}
}