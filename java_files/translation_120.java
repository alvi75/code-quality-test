ublic DescribeEventSourceResponse DescribeEventSource(DescribeEventSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeEventSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeEventSourceResponseUnmarshaller.Instance;
    return Invoke<DescribeEventSourceResponse>(request, options);
}