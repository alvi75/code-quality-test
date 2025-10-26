ublic DeleteDataSourceResponse DeleteDataSource(DeleteDataSourceRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDataSourceRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDataSourceResponseUnmarshaller.Instance;
    return Invoke<DeleteDataSourceResponse>(request, options);
}