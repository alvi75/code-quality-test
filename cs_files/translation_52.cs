using System;
using System.Collections.Generic;

public class Translation52
{
    public virtual GetGatewayResponsesResponse GetGatewayResponses(GetGatewayResponsesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetGatewayResponsesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetGatewayResponsesResponseUnmarshaller.Instance;
    return Invoke<GetGatewayResponsesResponse>(request, options);
}
}