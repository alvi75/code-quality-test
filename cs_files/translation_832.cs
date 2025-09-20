using System;
using System.Collections.Generic;

public class Translation832
{
    public virtual DeleteRouteTableResponse DeleteRouteTable(DeleteRouteTableRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteRouteTableRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteRouteTableResponseUnmarshaller.Instance;
    return Invoke<DeleteRouteTableResponse>(request, options);
}
}