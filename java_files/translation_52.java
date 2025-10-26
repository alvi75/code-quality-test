import java.util.*;

public class Translation52 {
    ublic GetGatewayResponsesResponse GetGatewayResponses(GetGatewayResponsesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetGatewayResponsesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetGatewayResponsesResponseUnmarshaller.Instance;
    return Invoke<GetGatewayResponsesResponse>(request, options);
}
}