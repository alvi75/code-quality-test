import java.util.*;

public class Translation215 {
    ublic CreateDBClusterParameterGroupResponse CreateDBClusterParameterGroup(CreateDBClusterParameterGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDBClusterParameterGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDBClusterParameterGroupResponseUnmarshaller.Instance;
    return Invoke<CreateDBClusterParameterGroupResponse>(request, options);
}
}