ublic ListDirectoriesResponse ListDirectories(ListDirectoriesRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = ListDirectoriesRequestMarshaller.Instance;
    options.ResponseUnmarshaller = ListDirectoriesResponseUnmarshaller.Instance;
    return Invoke<ListDirectoriesResponse>(request, options);
}