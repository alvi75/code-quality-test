ublic DescribeResizeResponse DescribeResize(DescribeResizeRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeResizeRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeResizeResponseUnmarshaller.Instance;
    return Invoke<DescribeResizeResponse>(request, options);
}