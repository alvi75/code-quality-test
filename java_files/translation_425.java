ublic DeleteDetectorResponse DeleteDetector(DeleteDetectorRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteDetectorRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteDetectorResponseUnmarshaller.Instance;
    return Invoke<DeleteDetectorResponse>(request, options);
}