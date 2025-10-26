import java.util.*;

public class Translation433 {
    ublic BacktrackDBClusterResponse BacktrackDBCluster(BacktrackDBClusterRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = BacktrackDBClusterRequestMarshaller.Instance;
    options.ResponseUnmarshaller = BacktrackDBClusterResponseUnmarshaller.Instance;
    return Invoke<BacktrackDBClusterResponse>(request, options);
}
}