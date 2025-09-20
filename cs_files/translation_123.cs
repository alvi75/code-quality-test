using System;
using System.Collections.Generic;

public class Translation123
{
    public virtual ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyLoadBalancerAttributesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyLoadBalancerAttributesResponseUnmarshaller.Instance;
    return Invoke<ModifyLoadBalancerAttributesResponse>(request, options);
}
}