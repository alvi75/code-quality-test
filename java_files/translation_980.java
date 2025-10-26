ublic DescribeLogPatternResponse DescribeLogPattern(DescribeLogPatternRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeLogPatternRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeLogPatternResponseUnmarshaller.Instance;
    return Invoke<DescribeLogPatternResponse>(request, options);
}