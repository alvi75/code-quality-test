import java.util.*;

public class Translation916 {
    ublic CreateNetworkInterfaceResponse CreateNetworkInterface(CreateNetworkInterfaceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateNetworkInterfaceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateNetworkInterfaceResponseUnmarshaller.Instance;
    return Invoke<CreateNetworkInterfaceResponse>(request, options);
}
}