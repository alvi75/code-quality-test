import java.util.*;

public class Translation695 {
    ublic GetContactReachabilityStatusResponse GetContactReachabilityStatus(GetContactReachabilityStatusRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = GetContactReachabilityStatusRequestMarshaller.Instance;
    options.ResponseUnmarshaller = GetContactReachabilityStatusResponseUnmarshaller.Instance;
    return Invoke<GetContactReachabilityStatusResponse>(request, options);
}
}