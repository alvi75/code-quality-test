ublic ModifyLoadBalancerAttributesResponse ModifyLoadBalancerAttributes(ModifyLoadBalancerAttributesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ModifyLoadBalancerAttributesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ModifyLoadBalancerAttributesResponseUnmarshaller.Instance;
    return Invoke<ModifyLoadBalancerAttributesResponse>(request, options);
}