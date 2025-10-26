ublic RegisterInstancesWithLoadBalancerResponse RegisterInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = RegisterInstancesWithLoadBalancerRequestMarshaller.Instance;
    options.ResponseUnmarshaller = RegisterInstancesWithLoadBalancerResponseUnmarshaller.Instance;
    return Invoke<RegisterInstancesWithLoadBalancerResponse>(request, options);
}