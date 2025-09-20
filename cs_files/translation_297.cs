using System;
using System.Collections.Generic;

public class Translation297
{
    public virtual DeleteTransitGatewayResponse DeleteTransitGateway(DeleteTransitGatewayRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteTransitGatewayRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteTransitGatewayResponseUnmarshaller.Instance;
    return Invoke<DeleteTransitGatewayResponse>(request, options);
}
}