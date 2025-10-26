import java.util.*;

public class Translation401 {
    ublic GetRouteResponse GetRoute(GetRouteRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetRouteRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetRouteResponseUnmarshaller.Instance;
    return Invoke<GetRouteResponse>(request, options);
}
}