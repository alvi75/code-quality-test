ublic DescribeDBProxiesResponse DescribeDBProxies(DescribeDBProxiesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDBProxiesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDBProxiesResponseUnmarshaller.Instance;
    return Invoke<DescribeDBProxiesResponse>(request, options);
}