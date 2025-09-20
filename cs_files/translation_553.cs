using System;
using System.Collections.Generic;

public class Translation553
{
    public virtual DeleteNetworkAclEntryResponse DeleteNetworkAclEntry(DeleteNetworkAclEntryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteNetworkAclEntryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteNetworkAclEntryResponseUnmarshaller.Instance;
    return Invoke<DeleteNetworkAclEntryResponse>(request, options);
}
}