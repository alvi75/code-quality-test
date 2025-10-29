import java.util.*;

public class Translation246 {
    ublic CreateGatewayGroupResponse CreateGatewayGroup(CreateGatewayGroupRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateGatewayGroupRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateGatewayGroupResponseUnmarshaller.Instance;
    return Invoke<CreateGatewayGroupResponse>(request, options);
}
}