using System;
using System.Collections.Generic;

public class Translation624
{
    public virtual RegisterInstancesWithLoadBalancerResponse RegisterInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterInstancesWithLoadBalancerRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterInstancesWithLoadBalancerResponseUnmarshaller.Instance;
    return Invoke<RegisterInstancesWithLoadBalancerResponse>(request, options);
}
}