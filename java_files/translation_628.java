import java.util.*;

public class Translation628 {
    ublic DeleteVirtualInterfaceResponse DeleteVirtualInterface(DeleteVirtualInterfaceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVirtualInterfaceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVirtualInterfaceResponseUnmarshaller.Instance;
    return Invoke<DeleteVirtualInterfaceResponse>(request, options);
}
}