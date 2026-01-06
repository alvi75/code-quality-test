import java.util.*;

public class Translation429 {
    ublic DBCluster restoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request) {
    var options = new InvokeOptions();
    options.RequestMarshaller = RestoreDBClusterToPointInTimeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RestoreDBClusterToPointInTimeResponseUnmarshaller.Instance;
    return Invoke<DBCluster>(request, options);
}
}