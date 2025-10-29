import java.util.*;

public class Translation429 {
    ublic RestoreDBClusterToPointInTimeResponse RestoreDBClusterToPointInTime(RestoreDBClusterToPointInTimeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RestoreDBClusterToPointInTimeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RestoreDBClusterToPointInTimeResponseUnmarshaller.Instance;
    return Invoke<RestoreDBClusterToPointInTimeResponse>(request, options);
}
}