ublic CreateDataSourceFromRedshiftResponse CreateDataSourceFromRedshift(CreateDataSourceFromRedshiftRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = CreateDataSourceFromRedshiftRequestMarshaller.Instance;
    options.ResponseUnmarshaller = CreateDataSourceFromRedshiftResponseUnmarshaller.Instance;
    return Invoke<CreateDataSourceFromRedshiftResponse>(request, options);
}