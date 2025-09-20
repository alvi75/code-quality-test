using System;
using System.Collections.Generic;

public class Translation377
{
    public virtual AttachLoadBalancersResponse AttachLoadBalancers(AttachLoadBalancersRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = AttachLoadBalancersRequestMarshaller.Instance;
    options.ResponseUnmarshaller = AttachLoadBalancersResponseUnmarshaller.Instance;
    return Invoke<AttachLoadBalancersResponse>(request, options);
}
}