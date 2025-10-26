ublic InitiateMultipartUploadResponse InitiateMultipartUpload(InitiateMultipartUploadRequest request){
    var options = new InvokeOptions();
    options.RequestMarshaller = InitiateMultipartUploadRequestMarshaller.Instance;
    options.ResponseUnmarshaller = InitiateMultipartUploadResponseUnmarshaller.Instance;
    return Invoke<InitiateMultipartUploadResponse>(request, options);
}