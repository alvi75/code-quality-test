ublic DescribeDetectorResponse DescribeDetector(DescribeDetectorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDetectorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDetectorResponseUnmarshaller.Instance;
    return Invoke<DescribeDetectorResponse>(request, options);
}