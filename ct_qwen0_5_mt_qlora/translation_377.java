import java.util.*;

public class Translation377 {
    public AttachLoadBalancersResult attachLoadBalancers(AttachLoadBalancersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AttachLoadBalancersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AttachLoadBalancersResponseUnmarshaller.Instance;
    return Invoke<AttachLoadBalancersResponse>(request, options);
}
}