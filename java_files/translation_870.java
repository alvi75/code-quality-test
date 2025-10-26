ublic DescribeImportImageTasksResponse DescribeImportImageTasks(DescribeImportImageTasksRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DescribeImportImageTasksRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DescribeImportImageTasksResponseUnmarshaller.Instance;
    return Invoke<DescribeImportImageTasksResponse>(request, options);
}