using System;
using System.Collections.Generic;

public class Translation628
{
    public virtual DeleteVirtualInterfaceResponse DeleteVirtualInterface(DeleteVirtualInterfaceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteVirtualInterfaceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteVirtualInterfaceResponseUnmarshaller.Instance;
    return Invoke<DeleteVirtualInterfaceResponse>(request, options);
}
}