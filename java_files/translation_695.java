import java.util.*;

public class Translation695 {
    ublic GetContactReachabilityStatusResult GetContactReachabilityStatus(GetContactReachabilityStatusRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetContactReachabilityStatusRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetContactReachabilityStatusResponseUnmarshaller.Instance;
    return Invoke<GetContactReachabilityStatusResponse>(request, options);
}
}