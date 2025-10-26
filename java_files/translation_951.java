import java.util.*;

public class Translation951 {
    ublic CreateVpcEndpointResponse CreateVpcEndpoint(CreateVpcEndpointRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateVpcEndpointRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateVpcEndpointResponseUnmarshaller.Instance;
    return Invoke<CreateVpcEndpointResponse>(request, options);
}
}