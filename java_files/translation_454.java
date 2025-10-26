import java.util.*;

public class Translation454 {
    ublic SuspendGameServerGroupResponse SuspendGameServerGroup(SuspendGameServerGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = SuspendGameServerGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = SuspendGameServerGroupResponseUnmarshaller.Instance;
    return Invoke<SuspendGameServerGroupResponse>(request, options);
}
}