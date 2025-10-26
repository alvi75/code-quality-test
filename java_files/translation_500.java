ublic DeleteImageResponse DeleteImage(DeleteImageRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = DeleteImageRequestMarshaller.Instance;
    options.ResponseUnmarshaller = DeleteImageResponseUnmarshaller.Instance;
    return Invoke<DeleteImageResponse>(request, options);
}