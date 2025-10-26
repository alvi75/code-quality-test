import java.util.*;

public class Translation402 {
    ublic DeleteClusterResponse DeleteCluster(DeleteClusterRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteClusterRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteClusterResponseUnmarshaller.Instance;
    return Invoke<DeleteClusterResponse>(request, options);
}
}