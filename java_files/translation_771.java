import java.util.*;

public class Translation771 {
    ublic DeleteClusterSubnetGroupResponse DeleteClusterSubnetGroup(DeleteClusterSubnetGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteClusterSubnetGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteClusterSubnetGroupResponseUnmarshaller.Instance;
    return Invoke<DeleteClusterSubnetGroupResponse>(request, options);
}
}