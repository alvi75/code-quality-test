ublic DescribeServiceUpdatesResponse DescribeServiceUpdates(DescribeServiceUpdatesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeServiceUpdatesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeServiceUpdatesResponseUnmarshaller.Instance;
    return Invoke<DescribeServiceUpdatesResponse>(request, options);
}