import java.util.*;

public class Translation896 {
    ublic DeleteRouteResponseResponse DeleteRouteResponse(DeleteRouteResponseRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteRouteResponseRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteRouteResponseResponseUnmarshaller.Instance;
    return Invoke<DeleteRouteResponseResponse>(request, options);
}
}