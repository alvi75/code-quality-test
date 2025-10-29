import java.util.*;

public class Translation920 {
    ublic GetGatewayGroupResponse GetGatewayGroup(GetGatewayGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetGatewayGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetGatewayGroupResponseUnmarshaller.Instance;
    return Invoke<GetGatewayGroupResponse>(request, options);
}
}