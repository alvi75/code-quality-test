ublic DescribeDataSetResponse DescribeDataSet(DescribeDataSetRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeDataSetRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeDataSetResponseUnmarshaller.Instance;
    return Invoke<DescribeDataSetResponse>(request, options);
}