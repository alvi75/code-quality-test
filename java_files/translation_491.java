ublic DeleteNamedQueryResponse DeleteNamedQuery(DeleteNamedQueryRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteNamedQueryRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteNamedQueryResponseUnmarshaller.Instance;
    return Invoke<DeleteNamedQueryResponse>(request, options);
}