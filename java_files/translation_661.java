ublic DescribeLifecycleHooksResponse DescribeLifecycleHooks(DescribeLifecycleHooksRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLifecycleHooksRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLifecycleHooksResponseUnmarshaller.Instance;
    return Invoke<DescribeLifecycleHooksResponse>(request, options);
}