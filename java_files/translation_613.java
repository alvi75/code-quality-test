import java.util.*;

public class Translation613 {
    ublic DeleteReplicationGroupResponse DeleteReplicationGroup(DeleteReplicationGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteReplicationGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteReplicationGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteReplicationGroupResponse>(request, options);
}
}