ublic ListObjectParentPathsResponse ListObjectParentPaths(ListObjectParentPathsRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListObjectParentPathsRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListObjectParentPathsResponseUnmarshaller.Instance;
    return Invoke<ListObjectParentPathsResponse>(request, options);
}